import io.gatling.core.Predef._
import io.gatling.http.Predef._

package object perf {
  val httpProtocol = http
    .baseUrl("http://www.load-test.ru:1080")
    .acceptHeader("text/html, application/xhtml+xm, application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US, en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
    .disableFollowRedirect
}

