package com.stackmob.newman

trait ProxyClient extends HasContext {
  def proxy: Proxy

  override def context = super.context.copy(proxy = Some(proxy))
}
