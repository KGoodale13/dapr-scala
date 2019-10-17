// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.dapr

@SerialVersionUID(0L)
final case class StateRequest(
    key: _root_.scala.Predef.String = "",
    value: _root_.scala.Option[com.google.protobuf.any.Any] = _root_.scala.None,
    etag: _root_.scala.Predef.String = "",
    metadata: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String] = _root_.scala.collection.immutable.Map.empty,
    options: _root_.scala.Option[io.dapr.StateRequestOptions] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[StateRequest] with scalapb.lenses.Updatable[StateRequest] {
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
      if (value.isDefined) {
        val __value = value.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = etag
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      metadata.foreach { __item =>
        val __value = io.dapr.StateRequest._typemapper_metadata.toBase(__item)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      if (options.isDefined) {
        val __value = options.get
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
        val __v = key
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      value.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = etag
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      metadata.foreach { __v =>
        val __m = io.dapr.StateRequest._typemapper_metadata.toBase(__v)
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.dapr.StateRequest = {
      var __key = this.key
      var __value = this.value
      var __etag = this.etag
      val __metadata = (_root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Predef.String] ++= this.metadata)
      var __options = this.options
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __key = _input__.readString()
          case 18 =>
            __value = Option(_root_.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case 26 =>
            __etag = _input__.readString()
          case 34 =>
            __metadata += io.dapr.StateRequest._typemapper_metadata.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, io.dapr.StateRequest.MetadataEntry.defaultInstance))
          case 42 =>
            __options = Option(_root_.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(io.dapr.StateRequestOptions.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      io.dapr.StateRequest(
          key = __key,
          value = __value,
          etag = __etag,
          metadata = __metadata.result(),
          options = __options
      )
    }
    def withKey(__v: _root_.scala.Predef.String): StateRequest = copy(key = __v)
    def getValue: com.google.protobuf.any.Any = value.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearValue: StateRequest = copy(value = _root_.scala.None)
    def withValue(__v: com.google.protobuf.any.Any): StateRequest = copy(value = Option(__v))
    def withEtag(__v: _root_.scala.Predef.String): StateRequest = copy(etag = __v)
    def clearMetadata = copy(metadata = _root_.scala.collection.immutable.Map.empty)
    def addMetadata(__vs: (_root_.scala.Predef.String, _root_.scala.Predef.String)*): StateRequest = addAllMetadata(__vs)
    def addAllMetadata(__vs: Iterable[(_root_.scala.Predef.String, _root_.scala.Predef.String)]): StateRequest = copy(metadata = metadata ++ __vs)
    def withMetadata(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]): StateRequest = copy(metadata = __v)
    def getOptions: io.dapr.StateRequestOptions = options.getOrElse(io.dapr.StateRequestOptions.defaultInstance)
    def clearOptions: StateRequest = copy(options = _root_.scala.None)
    def withOptions(__v: io.dapr.StateRequestOptions): StateRequest = copy(options = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = key
          if (__t != "") __t else null
        }
        case 2 => value.orNull
        case 3 => {
          val __t = etag
          if (__t != "") __t else null
        }
        case 4 => metadata.iterator.map(io.dapr.StateRequest._typemapper_metadata.toBase).toSeq
        case 5 => options.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(key)
        case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PString(etag)
        case 4 => _root_.scalapb.descriptors.PRepeated(metadata.iterator.map(io.dapr.StateRequest._typemapper_metadata.toBase(_).toPMessage).toVector)
        case 5 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.dapr.StateRequest
}

object StateRequest extends scalapb.GeneratedMessageCompanion[io.dapr.StateRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.dapr.StateRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.dapr.StateRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.dapr.StateRequest(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.protobuf.any.Any]],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.Seq[io.dapr.StateRequest.MetadataEntry]].iterator.map(io.dapr.StateRequest._typemapper_metadata.toCustom).toMap,
      __fieldsMap.get(__fields.get(4)).asInstanceOf[_root_.scala.Option[io.dapr.StateRequestOptions]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.dapr.StateRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.dapr.StateRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Seq[io.dapr.StateRequest.MetadataEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(io.dapr.StateRequest._typemapper_metadata.toCustom).toMap,
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[io.dapr.StateRequestOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DaprProto.javaDescriptor.getMessageTypes.get(8)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DaprProto.scalaDescriptor.messages(8)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.any.Any
      case 4 => __out = io.dapr.StateRequest.MetadataEntry
      case 5 => __out = io.dapr.StateRequestOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.io.dapr.StateRequest.MetadataEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.dapr.StateRequest(
    key = "",
    value = _root_.scala.None,
    etag = "",
    metadata = _root_.scala.collection.immutable.Map.empty,
    options = _root_.scala.None
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
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.dapr.StateRequest.MetadataEntry = {
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
        io.dapr.StateRequest.MetadataEntry(
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
      def companion = io.dapr.StateRequest.MetadataEntry
  }
  
  object MetadataEntry extends scalapb.GeneratedMessageCompanion[io.dapr.StateRequest.MetadataEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.dapr.StateRequest.MetadataEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.dapr.StateRequest.MetadataEntry = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      io.dapr.StateRequest.MetadataEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[io.dapr.StateRequest.MetadataEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        io.dapr.StateRequest.MetadataEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = io.dapr.StateRequest.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = io.dapr.StateRequest.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = io.dapr.StateRequest.MetadataEntry(
      key = "",
      value = ""
    )
    implicit class MetadataEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.StateRequest.MetadataEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.dapr.StateRequest.MetadataEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[io.dapr.StateRequest.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] =
      _root_.scalapb.TypeMapper[io.dapr.StateRequest.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)](__m => (__m.key, __m.value))(__p => io.dapr.StateRequest.MetadataEntry(__p._1, __p._2))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Predef.String
    ): _root_.io.dapr.StateRequest.MetadataEntry = _root_.io.dapr.StateRequest.MetadataEntry(
      key,
      value
    )
  }
  
  implicit class StateRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.StateRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.dapr.StateRequest](_l) {
    def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
    def value: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
    def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.any.Any]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    def etag: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.etag)((c_, f_) => c_.copy(etag = f_))
    def metadata: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]] = field(_.metadata)((c_, f_) => c_.copy(metadata = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.StateRequestOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Option(f_)))
    def optionalOptions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[io.dapr.StateRequestOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val KEY_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  final val ETAG_FIELD_NUMBER = 3
  final val METADATA_FIELD_NUMBER = 4
  final val OPTIONS_FIELD_NUMBER = 5
  @transient
  private val _typemapper_metadata: _root_.scalapb.TypeMapper[io.dapr.StateRequest.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] = implicitly[_root_.scalapb.TypeMapper[io.dapr.StateRequest.MetadataEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)]]
  def of(
    key: _root_.scala.Predef.String,
    value: _root_.scala.Option[com.google.protobuf.any.Any],
    etag: _root_.scala.Predef.String,
    metadata: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String],
    options: _root_.scala.Option[io.dapr.StateRequestOptions]
  ): _root_.io.dapr.StateRequest = _root_.io.dapr.StateRequest(
    key,
    value,
    etag,
    metadata,
    options
  )
}
