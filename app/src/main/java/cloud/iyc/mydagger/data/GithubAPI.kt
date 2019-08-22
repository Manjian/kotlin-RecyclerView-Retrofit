package cloud.iyc.mydagger.data

import io.reactivex.Observable
import retrofit2.http.GET

interface GithubAPI {

    @GET("repositories")
    fun getServerRepo() : Observable<List<GithubData>>
}