package com.lesiak.assertj.scala

import org.assertj.core.api.Assertions

object ScalaAssertions extends Assertions {

  def assertThat[V <: AnyRef](iterable: Iterable[V]): ScalaIterableAssert[V] = {
    new ScalaIterableAssert[V](iterable)
  }

}