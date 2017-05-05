import org.reekwest.http.core.HttpHandler
import org.reekwest.http.core.Response
import org.reekwest.http.core.Status.Companion.OK
import org.reekwest.http.server.asJettyServer

fun main(args: Array<String>) {
    val svc: HttpHandler = { Response(OK).body("hello") }

    svc.asJettyServer(8000).start().block()
}