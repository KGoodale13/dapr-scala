// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.dapr

@SerialVersionUID(0L)
final case class InvokeEnvelope(
    method: _root_.scala.Predef.String = "",
    data: _root_.scala.Option[com.google.protobuf.any.Any] = _root_.scala.None,
    metadata: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String] = _root_.scala.collection.immutable.Map.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[InvokeEnvelope] with scalapb.lenses.Updatable[InvokeEnvelope] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = method
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (data.isDefined) {
        val __value = data.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      metadata.foreach { __item =>
        val __value = io.dapr.InvokeEnvelope._typemapper_metadata.toBase(__item)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      {
        val __v = method
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
      metadata.foreach { __v =>
        val __m = io.dapr.InvokeEnvelope._typemapper_metadata.toBase(__v)
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.dapr.InvokeEnvelope = {
      var __method = this.method
      var __data = this.data
      val __metadata = (_root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Predef.String] ++= this.metadata)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __method = _input__.readString()
          case 18 =>
            __data = Option(_root_.scalapb.LiteParser.readMessage(_input__, __data.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case 26 =>
            __metadata += io.dapr.InvokeEnvelope._typemapper_metadata.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, io.dapr.InvokeEnvelope.MetadataEntry.defaultInstance))
          case tag => _input__.skipField(tag)
        }
      }
      io.dapr.InvokeEnvelope(
          method = __method,
          data = __data,
          metadata = __metadata.result()
      )
    }
    def withMethod(__v: _root_.scala.Predef.String): InvokeEnvelope = copy(method = __v)
    def getData: com.google.protobuf.any.Any = data.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearData: InvokeEnvelope = copy(data = _root_.scala.None)
    def withData(__v: com.google.protobuf.any.Any): InvokeEnvelope = copy(data = Option(__v))
    def clearMetadata = copy(metadata = _root_.scala.collection.immutable.Map.empty)
    def addMetadata(__vs: (_root_.scala.Predef.String, _root_.scala.Predef.String)*): InvokeEnvelope = addAllMetadata(__vs)
    def addAllMetadata(__vs: Iterable[(_root_.scala.Predef.String, _root_.scala.Predef.String)]): InvokeEnvelope = copy(metadata = metadata ++ __vs)
    def withMetadata(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]): InvokeEnvelope = copy(metadata = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = method
          if (__t != "") __t else null
        }
        case 2 => data.orNull
        case 3 => metadata.iterator.map(io.dapr.InvokeEnvelope._typemapper_metadata.toBase).toSeq
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(method)
        case 2 => data.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PRepeated(metadata.iterator.map(io.dapr.InvokeEnvelope._typemapper_metadata.toBase(_).toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.dapr.InvokeEnvelope
}

object InvokeEnvelope extends scalapb.GeneratedMessageCompanion[io.dapr.InvokeEnvelope] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.dapr.InvokeEnvelope] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.dapr.InvokeEnvelope = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.dapr.InvokeEnvelope(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.protobuf.any.Any]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[io.dapr.InvokeEnvelope.MetadataEntry]].iterator.map(io.dapr.InvokeEnvelope._typemapper_metadata.toCustom).toMap
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.dapr.InvokeEnvelope] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.dapr.InvokeEnvelope(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[io.dapr.InvokeEnvelope.MetadataEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(io.dapr.InvokeEnvelope._typemapper_metadata.toCustom).toMap
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DaprclientProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DaprclientProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.any.Any
      case 3 => __out = io.dapr.InvokeEnvelope.MetadataEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.io.dapr.InvokeEnvelope.MetadataEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.dapr.InvokeEnvelope(
    method = "",
    data = _root_.scala.None,
    metadata = _root_.scala.collection.immutable.Map.empty
  )
  @SerialVersionUID(0L)
  final case class MetadataEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Predef.String = ""
      ) extends scalapb.GeneratedMessage with scalapb.Message[MetadataEntry] with scalapb.lenses.Updatable[MetadataEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        
        {
          val __value = value
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
          }
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
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = value
          if (__v != "") {
            _output__.writeString(2, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.dapr.InvokeEnvelope.MetadataEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = _input__.readString()
            case tag => _input__.skipField(tag)
          }
        }
        io.dapr.InvokeEnvelope.MetadataEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): MetadataEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Predef.String): MetadataEntry = copy(value = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = value
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => _root_.scalapb.descriptors.PString(value)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = io.dapr.InvokeEnvelope.MetadataEntry
  }
  
  object MetadataEntry extends scalapb.GeneratedMessageCompanion[io.dapr.InvokeEnvelope.MetadataEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.dapr.InvokeEnvelope.MetadataEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.dapr.InvokeEnvelope.MetadataEntry = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      io.dapr.InvokeEnvelope.MetadataEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[io.dapr.InvokeEnvelope.MetadataEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        io.dapr.InvokeEnvelope.MetadataEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = io.dapr.InvokeEnvelope.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = io.dapr.InvokeEnvelope.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = io.dapr.InvokeEnvelope.MetadataEntry(
      key = "",
      value = ""
    )
    implicit class MetadataEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.InvokeEnvelope.MetadataEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.dapr.InvokeEnvelope.MetadataEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[io.dapr.InvokeEnvelope.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] =
      _root_.scalapb.TypeMapper[io.dapr.InvokeEnvelope.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)](__m => (__m.key, __m.value))(__p => io.dapr.InvokeEnvelope.MetadataEntry(__p._1, __p._2))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Predef.String
    ): _root_.io.dapr.InvokeEnvelope.MetadataEntry = _root_.io.dapr.InvokeEnvelope.MetadataEntry(
      key,
      value
    )
  }
  
  implicit class InvokeEnvelopeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.InvokeEnvelope]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.dapr.InvokeEnvelope](_l) {
    def method: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.method)((c_, f_) => c_.copy(method = f_))
    def data: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getData)((c_, f_) => c_.copy(data = Option(f_)))
    def optionalData: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.any.Any]] = field(_.data)((c_, f_) => c_.copy(data = f_))
    def metadata: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]] = field(_.metadata)((c_, f_) => c_.copy(metadata = f_))
  }
  final val METHOD_FIELD_NUMBER = 1
  final val DATA_FIELD_NUMBER = 2
  final val METADATA_FIELD_NUMBER = 3
  @transient
  private val _typemapper_metadata: _root_.scalapb.TypeMapper[io.dapr.InvokeEnvelope.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] = implicitly[_root_.scalapb.TypeMapper[io.dapr.InvokeEnvelope.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)]]
  def of(
    method: _root_.scala.Predef.String,
    data: _root_.scala.Option[com.google.protobuf.any.Any],
    metadata: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]
  ): _root_.io.dapr.InvokeEnvelope = _root_.io.dapr.InvokeEnvelope(
    method,
    data,
    metadata
  )
}
