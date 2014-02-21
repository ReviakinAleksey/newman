package com.stackmob.newman

import java.net.{InetSocketAddress, SocketAddress}


case class Credentials(user:String, password: String)
case class Proxy(host:String, port: Int, credentials: Option[Credentials] = None) {
  val address:  SocketAddress = new InetSocketAddress(host, port)
}

case class HttpContext(proxy: Option[Proxy])


abstract class HasContext {
  def context =  HttpContext(None)
}
