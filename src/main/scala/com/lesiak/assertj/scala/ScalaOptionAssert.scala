package com.lesiak.assertj.scala

import scala.jdk.OptionConverters.RichOption

import org.assertj.core.api.AbstractOptionalAssert

class ScalaOptionAssert[T <: AnyRef](actual: Option[T])
  extends AbstractOptionalAssert[
    ScalaOptionAssert[T],
    T
  ](actual.toJava, classOf[ScalaOptionAssert[T]]) {}

