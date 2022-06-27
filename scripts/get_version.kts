import java.io.File

object GetVersion {
    fun search(args: Array<String>): String? {
        val commitMessage = args.first()
        val version = commitMessage.substringAfterLast("/")
        return version
    }
}

val version = GetVersion.search(args)
println(version)
