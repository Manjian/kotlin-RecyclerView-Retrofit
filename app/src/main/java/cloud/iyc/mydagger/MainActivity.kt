package cloud.iyc.mydagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import cloud.iyc.mydagger.data.GithubAPI
import cloud.iyc.mydagger.data.GithubData
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.reactivex.Observable
import io.reactivex.Observer


import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {


    private var myAdapter: MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson: Gson = GsonBuilder().setLenient().create()

        var retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        var githubAPI: GithubAPI = retrofit.create(GithubAPI::class.java)


        var observable: Observable<List<GithubData>> = githubAPI.getServerRepo()
        observable
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<List<GithubData>> {
                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(t: List<GithubData>) {
                 t.forEach {
                     print(it.name)
                 }
                }

                override fun onError(e: Throwable) {
                }
            })
                




        myAdapter = MyAdapter(
            ArrayList<String>().apply {
                add("test0")
                add("test1")
                add("test2")
            }
        )
        repoList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = myAdapter
        }


        myAdapter?.notifyDataSetChanged()
    }
}



