package com.lesiak.assertj.scala

import org.assertj.core.api.Assertions

object ScalaAssertions extends Assertions {

  def assertThat[V <: AnyRef](iterable: Iterable[V]): ScalaIterableAssert[V] = {
    new ScalaIterableAssert[V](iterable)
  }

  def assertThat[V <: AnyRef](option: Option[V]): ScalaOptionAssert[V] = {
    new ScalaOptionAssert[V](option)
  }

}