// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.dapr

@SerialVersionUID(0L)
final case class CloudEventEnvelope(
    id: _root_.scala.Predef.String = "",
    source: _root_.scala.Predef.String = "",
    `type`: _root_.scala.Predef.String = "",
    specVersion: _root_.scala.Predef.String = "",
    dataContentType: _root_.scala.Predef.String = "",
    topic: _root_.scala.Predef.String = "",
    data: _root_.scala.Option[com.google.protobuf.any.Any] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[CloudEventEnvelope] with scalapb.lenses.Updatable[CloudEventEnvelope] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = id
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = source
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = `type`
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = specVersion
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = dataContentType
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
        }
      };
      
      {
        val __value = topic
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
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
        val __v = id
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = source
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = `type`
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = specVersion
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = dataContentType
        if (__v != "") {
          _output__.writeString(5, __v)
        }
      };
      {
        val __v = topic
        if (__v != "") {
          _output__.writeString(6, __v)
        }
      };
      data.foreach { __v =>
        val __m = __v
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.dapr.CloudEventEnvelope = {
      var __id = this.id
      var __source = this.source
      var __type = this.`type`
      var __specVersion = this.specVersion
      var __dataContentType = this.dataContentType
      var __topic = this.topic
      var __data = this.data
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __id = _input__.readString()
          case 18 =>
            __source = _input__.readString()
          case 26 =>
            __type = _input__.readString()
          case 34 =>
            __specVersion = _input__.readString()
          case 42 =>
            __dataContentType = _input__.readString()
          case 50 =>
            __topic = _input__.readString()
          case 58 =>
            __data = Option(_root_.scalapb.LiteParser.readMessage(_input__, __data.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      io.dapr.CloudEventEnvelope(
          id = __id,
          source = __source,
          `type` = __type,
          specVersion = __specVersion,
          dataContentType = __dataContentType,
          topic = __topic,
          data = __data
      )
    }
    def withId(__v: _root_.scala.Predef.String): CloudEventEnvelope = copy(id = __v)
    def withSource(__v: _root_.scala.Predef.String): CloudEventEnvelope = copy(source = __v)
    def withType(__v: _root_.scala.Predef.String): CloudEventEnvelope = copy(`type` = __v)
    def withSpecVersion(__v: _root_.scala.Predef.String): CloudEventEnvelope = copy(specVersion = __v)
    def withDataContentType(__v: _root_.scala.Predef.String): CloudEventEnvelope = copy(dataContentType = __v)
    def withTopic(__v: _root_.scala.Predef.String): CloudEventEnvelope = copy(topic = __v)
    def getData: com.google.protobuf.any.Any = data.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearData: CloudEventEnvelope = copy(data = _root_.scala.None)
    def withData(__v: com.google.protobuf.any.Any): CloudEventEnvelope = copy(data = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = id
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = source
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = `type`
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = specVersion
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = dataContentType
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = topic
          if (__t != "") __t else null
        }
        case 7 => data.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(id)
        case 2 => _root_.scalapb.descriptors.PString(source)
        case 3 => _root_.scalapb.descriptors.PString(`type`)
        case 4 => _root_.scalapb.descriptors.PString(specVersion)
        case 5 => _root_.scalapb.descriptors.PString(dataContentType)
        case 6 => _root_.scalapb.descriptors.PString(topic)
        case 7 => data.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.dapr.CloudEventEnvelope
}

object CloudEventEnvelope extends scalapb.GeneratedMessageCompanion[io.dapr.CloudEventEnvelope] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.dapr.CloudEventEnvelope] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.dapr.CloudEventEnvelope = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.dapr.CloudEventEnvelope(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(4), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(5), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(6)).asInstanceOf[_root_.scala.Option[com.google.protobuf.any.Any]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.dapr.CloudEventEnvelope] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.dapr.CloudEventEnvelope(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DaprclientProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DaprclientProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 7 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.dapr.CloudEventEnvelope(
    id = "",
    source = "",
    `type` = "",
    specVersion = "",
    dataContentType = "",
    topic = "",
    data = _root_.scala.None
  )
  implicit class CloudEventEnvelopeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.CloudEventEnvelope]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.dapr.CloudEventEnvelope](_l) {
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def source: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.source)((c_, f_) => c_.copy(source = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def specVersion: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.specVersion)((c_, f_) => c_.copy(specVersion = f_))
    def dataContentType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.dataContentType)((c_, f_) => c_.copy(dataContentType = f_))
    def topic: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.topic)((c_, f_) => c_.copy(topic = f_))
    def data: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getData)((c_, f_) => c_.copy(data = Option(f_)))
    def optionalData: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.any.Any]] = field(_.data)((c_, f_) => c_.copy(data = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val SOURCE_FIELD_NUMBER = 2
  final val TYPE_FIELD_NUMBER = 3
  final val SPECVERSION_FIELD_NUMBER = 4
  final val DATACONTENTTYPE_FIELD_NUMBER = 5
  final val TOPIC_FIELD_NUMBER = 6
  final val DATA_FIELD_NUMBER = 7
  def of(
    id: _root_.scala.Predef.String,
    source: _root_.scala.Predef.String,
    `type`: _root_.scala.Predef.String,
    specVersion: _root_.scala.Predef.String,
    dataContentType: _root_.scala.Predef.String,
    topic: _root_.scala.Predef.String,
    data: _root_.scala.Option[com.google.protobuf.any.Any]
  ): _root_.io.dapr.CloudEventEnvelope = _root_.io.dapr.CloudEventEnvelope(
    id,
    source,
    `type`,
    specVersion,
    dataContentType,
    topic,
    data
  )
}
