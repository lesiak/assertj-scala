package com.lesiak.assertj.scala

import scala.jdk.CollectionConverters._

import org.assertj.core.api.AbstractMapAssert

class ScalaMapAssert[K, V](actual: Map[K, _ <: V])
    extends AbstractMapAssert[
      ScalaMapAssert[K, V],
      java.util.Map[K, V],
      K,
      V
    ](actual.asJava, classOf[ScalaMapAssert[K, V]]) {}
