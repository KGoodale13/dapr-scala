// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.dapr

@SerialVersionUID(0L)
final case class GetBindingsSubscriptionsEnvelope(
    bindings: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[GetBindingsSubscriptionsEnvelope] with scalapb.lenses.Updatable[GetBindingsSubscriptionsEnvelope] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      bindings.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      bindings.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.dapr.GetBindingsSubscriptionsEnvelope = {
      val __bindings = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.bindings)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __bindings += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      io.dapr.GetBindingsSubscriptionsEnvelope(
          bindings = __bindings.result()
      )
    }
    def clearBindings = copy(bindings = _root_.scala.Seq.empty)
    def addBindings(__vs: _root_.scala.Predef.String*): GetBindingsSubscriptionsEnvelope = addAllBindings(__vs)
    def addAllBindings(__vs: Iterable[_root_.scala.Predef.String]): GetBindingsSubscriptionsEnvelope = copy(bindings = bindings ++ __vs)
    def withBindings(__v: _root_.scala.Seq[_root_.scala.Predef.String]): GetBindingsSubscriptionsEnvelope = copy(bindings = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => bindings
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(bindings.iterator.map(_root_.scalapb.descriptors.PString).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.dapr.GetBindingsSubscriptionsEnvelope
}

object GetBindingsSubscriptionsEnvelope extends scalapb.GeneratedMessageCompanion[io.dapr.GetBindingsSubscriptionsEnvelope] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.dapr.GetBindingsSubscriptionsEnvelope] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.dapr.GetBindingsSubscriptionsEnvelope = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.dapr.GetBindingsSubscriptionsEnvelope(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.dapr.GetBindingsSubscriptionsEnvelope] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.dapr.GetBindingsSubscriptionsEnvelope(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DaprclientProto.javaDescriptor.getMessageTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DaprclientProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.dapr.GetBindingsSubscriptionsEnvelope(
    bindings = _root_.scala.Seq.empty
  )
  implicit class GetBindingsSubscriptionsEnvelopeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.GetBindingsSubscriptionsEnvelope]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.dapr.GetBindingsSubscriptionsEnvelope](_l) {
    def bindings: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.bindings)((c_, f_) => c_.copy(bindings = f_))
  }
  final val BINDINGS_FIELD_NUMBER = 1
  def of(
    bindings: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.io.dapr.GetBindingsSubscriptionsEnvelope = _root_.io.dapr.GetBindingsSubscriptionsEnvelope(
    bindings
  )
}
