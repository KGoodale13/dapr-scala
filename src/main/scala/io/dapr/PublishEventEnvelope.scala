// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.dapr

@SerialVersionUID(0L)
final case class PublishEventEnvelope(
    topic: _root_.scala.Predef.String = "",
    data: _root_.scala.Option[com.google.protobuf.any.Any] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[PublishEventEnvelope] with scalapb.lenses.Updatable[PublishEventEnvelope] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = topic
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (data.isDefined) {
        val __value = data.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
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
      {
        val __v = topic
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      data.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.dapr.PublishEventEnvelope = {
      var __topic = this.topic
      var __data = this.data
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __topic = _input__.readString()
          case 18 =>
            __data = Option(_root_.scalapb.LiteParser.readMessage(_input__, __data.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      io.dapr.PublishEventEnvelope(
          topic = __topic,
          data = __data
      )
    }
    def withTopic(__v: _root_.scala.Predef.String): PublishEventEnvelope = copy(topic = __v)
    def getData: com.google.protobuf.any.Any = data.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearData: PublishEventEnvelope = copy(data = _root_.scala.None)
    def withData(__v: com.google.protobuf.any.Any): PublishEventEnvelope = copy(data = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = topic
          if (__t != "") __t else null
        }
        case 2 => data.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(topic)
        case 2 => data.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.dapr.PublishEventEnvelope
}

object PublishEventEnvelope extends scalapb.GeneratedMessageCompanion[io.dapr.PublishEventEnvelope] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.dapr.PublishEventEnvelope] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.dapr.PublishEventEnvelope = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.dapr.PublishEventEnvelope(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.protobuf.any.Any]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.dapr.PublishEventEnvelope] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.dapr.PublishEventEnvelope(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DaprProto.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DaprProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.dapr.PublishEventEnvelope(
    topic = "",
    data = _root_.scala.None
  )
  implicit class PublishEventEnvelopeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.PublishEventEnvelope]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.dapr.PublishEventEnvelope](_l) {
    def topic: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.topic)((c_, f_) => c_.copy(topic = f_))
    def data: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getData)((c_, f_) => c_.copy(data = Option(f_)))
    def optionalData: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.any.Any]] = field(_.data)((c_, f_) => c_.copy(data = f_))
  }
  final val TOPIC_FIELD_NUMBER = 1
  final val DATA_FIELD_NUMBER = 2
  def of(
    topic: _root_.scala.Predef.String,
    data: _root_.scala.Option[com.google.protobuf.any.Any]
  ): _root_.io.dapr.PublishEventEnvelope = _root_.io.dapr.PublishEventEnvelope(
    topic,
    data
  )
}
