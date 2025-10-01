package com.lesiak.assertj.scala

import org.assertj.core.api.Assertions

object ScalaAssertions extends Assertions {

  def assertThat[V](iterable: Iterable[V]): ScalaIterableAssert[V] = {
    new ScalaIterableAssert[V](iterable)
  }

  def assertThat[K, V](map: Map[K, V]): ScalaMapAssert[K, V] = {
    new ScalaMapAssert[K, V](map)
  }

  def assertThat[V](option: Option[V]): ScalaOptionAssert[V] = {
    new ScalaOptionAssert[V](option)
  }

}