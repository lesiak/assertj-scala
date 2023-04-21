package com.lesiak.assertj.scala

import scala.collection.JavaConverters._

import org.assertj.core.api.{AbstractIterableAssert, ObjectAssert, ObjectAssertFactory}
import org.assertj.core.util.IterableUtil

class ScalaIterableAssert[T <: AnyRef](actual: Iterable[_ <: T])
  extends AbstractIterableAssert[
    ScalaIterableAssert[T],
    java.lang.Iterable[_ <: T],
    T,
    ObjectAssert[T]
  ](actual.asJava, classOf[ScalaIterableAssert[T]]) {

  override protected def toAssert(value: T, description: String): ObjectAssert[T] = new ObjectAssertFactory[T]()
    .createAssert(value)
    .as(description)

  override protected def newAbstractIterableAssert(iterable: java.lang.Iterable[_ <: T]) = new ScalaIterableAssert[T](iterable.asScala)

  def doesNotContainAnyElementsOf(iterable: Iterable[T]): ScalaIterableAssert[T] = {
    iterables.assertDoesNotContainAnyElementsOf(info, actual.asJava, iterable.asJava)
    myself
  }

  def containsAll(iterable: Iterable[_ <: T]): ScalaIterableAssert[T] = {
    iterables.assertContainsAll(info, actual.asJava, iterable.asJava)
    myself
  }

  def isSubsetOf(values: Iterable[T]): ScalaIterableAssert[T] = {
    iterables.assertIsSubsetOf(info, actual.asJava, values.asJava)
    myself
  }

  def hasSameElementsAs(iterable: Iterable[_ <: T]): ScalaIterableAssert[T] = {
    iterables.assertContainsOnly(info, actual.asJava, IterableUtil.toArray(iterable.asJava))
    myself
  }

  def containsExactlyElementsOf(iterable: Iterable[_ <: T]): ScalaIterableAssert[T] = {
    iterables.assertDoesNotContainAnyElementsOf(info, actual.asJava, iterable.asJava)
    myself
  }

  def containsOnlyElementsOf(iterable: Iterable[_ <: T]): ScalaIterableAssert[T] = {
    iterables.assertContainsOnly(info, actual.asJava, IterableUtil.toArray(iterable.asJava))
    myself
  }

}