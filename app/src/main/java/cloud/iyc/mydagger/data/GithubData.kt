package cloud.iyc.mydagger.data

import com.google.gson.annotations.SerializedName

data class GithubData(@SerializedName("tags_url")
                      val tagsUrl: String = "",
                      @SerializedName("private")
                      val private: Boolean = false,
                      @SerializedName("contributors_url")
                      val contributorsUrl: String = "",
                      @SerializedName("notifications_url")
                      val notificationsUrl: String = "",
                      @SerializedName("description")
                      val description: String = "",
                      @SerializedName("subscription_url")
                      val subscriptionUrl: String = "",
                      @SerializedName("keys_url")
                      val keysUrl: String = "",
                      @SerializedName("branches_url")
                      val branchesUrl: String = "",
                      @SerializedName("deployments_url")
                      val deploymentsUrl: String = "",
                      @SerializedName("issue_comment_url")
                      val issueCommentUrl: String = "",
                      @SerializedName("labels_url")
                      val labelsUrl: String = "",
                      @SerializedName("subscribers_url")
                      val subscribersUrl: String = "",
                      @SerializedName("releases_url")
                      val releasesUrl: String = "",
                      @SerializedName("comments_url")
                      val commentsUrl: String = "",
                      @SerializedName("stargazers_url")
                      val stargazersUrl: String = "",
                      @SerializedName("id")
                      val id: Int = 0,
                      @SerializedName("owner")
                      val owner: Owner,
                      @SerializedName("archive_url")
                      val archiveUrl: String = "",
                      @SerializedName("commits_url")
                      val commitsUrl: String = "",
                      @SerializedName("git_refs_url")
                      val gitRefsUrl: String = "",
                      @SerializedName("forks_url")
                      val forksUrl: String = "",
                      @SerializedName("compare_url")
                      val compareUrl: String = "",
                      @SerializedName("statuses_url")
                      val statusesUrl: String = "",
                      @SerializedName("git_commits_url")
                      val gitCommitsUrl: String = "",
                      @SerializedName("blobs_url")
                      val blobsUrl: String = "",
                      @SerializedName("git_tags_url")
                      val gitTagsUrl: String = "",
                      @SerializedName("merges_url")
                      val mergesUrl: String = "",
                      @SerializedName("downloads_url")
                      val downloadsUrl: String = "",
                      @SerializedName("url")
                      val url: String = "",
                      @SerializedName("contents_url")
                      val contentsUrl: String = "",
                      @SerializedName("milestones_url")
                      val milestonesUrl: String = "",
                      @SerializedName("teams_url")
                      val teamsUrl: String = "",
                      @SerializedName("fork")
                      val fork: Boolean = false,
                      @SerializedName("issues_url")
                      val issuesUrl: String = "",
                      @SerializedName("full_name")
                      val fullName: String = "",
                      @SerializedName("events_url")
                      val eventsUrl: String = "",
                      @SerializedName("issue_events_url")
                      val issueEventsUrl: String = "",
                      @SerializedName("languages_url")
                      val languagesUrl: String = "",
                      @SerializedName("html_url")
                      val htmlUrl: String = "",
                      @SerializedName("collaborators_url")
                      val collaboratorsUrl: String = "",
                      @SerializedName("name")
                      val name: String = "",
                      @SerializedName("pulls_url")
                      val pullsUrl: String = "",
                      @SerializedName("hooks_url")
                      val hooksUrl: String = "",
                      @SerializedName("assignees_url")
                      val assigneesUrl: String = "",
                      @SerializedName("trees_url")
                      val treesUrl: String = "",
                      @SerializedName("node_id")
                      val nodeId: String = "")