// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.dapr

@SerialVersionUID(0L)
final case class BindingResponseEnvelope(
    data: _root_.scala.Option[com.google.protobuf.any.Any] = _root_.scala.None,
    to: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    state: _root_.scala.Seq[io.dapr.State] = _root_.scala.Seq.empty,
    concurrency: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[BindingResponseEnvelope] with scalapb.lenses.Updatable[BindingResponseEnvelope] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (data.isDefined) {
        val __value = data.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      to.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      }
      state.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = concurrency
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
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
      data.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      to.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      state.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = concurrency
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.dapr.BindingResponseEnvelope = {
      var __data = this.data
      val __to = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.to)
      val __state = (_root_.scala.collection.immutable.Vector.newBuilder[io.dapr.State] ++= this.state)
      var __concurrency = this.concurrency
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __data = Option(_root_.scalapb.LiteParser.readMessage(_input__, __data.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case 18 =>
            __to += _input__.readString()
          case 26 =>
            __state += _root_.scalapb.LiteParser.readMessage(_input__, io.dapr.State.defaultInstance)
          case 34 =>
            __concurrency = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      io.dapr.BindingResponseEnvelope(
          data = __data,
          to = __to.result(),
          state = __state.result(),
          concurrency = __concurrency
      )
    }
    def getData: com.google.protobuf.any.Any = data.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearData: BindingResponseEnvelope = copy(data = _root_.scala.None)
    def withData(__v: com.google.protobuf.any.Any): BindingResponseEnvelope = copy(data = Option(__v))
    def clearTo = copy(to = _root_.scala.Seq.empty)
    def addTo(__vs: _root_.scala.Predef.String*): BindingResponseEnvelope = addAllTo(__vs)
    def addAllTo(__vs: Iterable[_root_.scala.Predef.String]): BindingResponseEnvelope = copy(to = to ++ __vs)
    def withTo(__v: _root_.scala.Seq[_root_.scala.Predef.String]): BindingResponseEnvelope = copy(to = __v)
    def clearState = copy(state = _root_.scala.Seq.empty)
    def addState(__vs: io.dapr.State*): BindingResponseEnvelope = addAllState(__vs)
    def addAllState(__vs: Iterable[io.dapr.State]): BindingResponseEnvelope = copy(state = state ++ __vs)
    def withState(__v: _root_.scala.Seq[io.dapr.State]): BindingResponseEnvelope = copy(state = __v)
    def withConcurrency(__v: _root_.scala.Predef.String): BindingResponseEnvelope = copy(concurrency = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => data.orNull
        case 2 => to
        case 3 => state
        case 4 => {
          val __t = concurrency
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => data.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(to.iterator.map(_root_.scalapb.descriptors.PString).toVector)
        case 3 => _root_.scalapb.descriptors.PRepeated(state.iterator.map(_.toPMessage).toVector)
        case 4 => _root_.scalapb.descriptors.PString(concurrency)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.dapr.BindingResponseEnvelope
}

object BindingResponseEnvelope extends scalapb.GeneratedMessageCompanion[io.dapr.BindingResponseEnvelope] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.dapr.BindingResponseEnvelope] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.dapr.BindingResponseEnvelope = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.dapr.BindingResponseEnvelope(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.google.protobuf.any.Any]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[io.dapr.State]],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.dapr.BindingResponseEnvelope] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.dapr.BindingResponseEnvelope(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[io.dapr.State]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DaprclientProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DaprclientProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.any.Any
      case 3 => __out = io.dapr.State
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.dapr.BindingResponseEnvelope(
    data = _root_.scala.None,
    to = _root_.scala.Seq.empty,
    state = _root_.scala.Seq.empty,
    concurrency = ""
  )
  implicit class BindingResponseEnvelopeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.dapr.BindingResponseEnvelope]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.dapr.BindingResponseEnvelope](_l) {
    def data: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getData)((c_, f_) => c_.copy(data = Option(f_)))
    def optionalData: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.any.Any]] = field(_.data)((c_, f_) => c_.copy(data = f_))
    def to: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.to)((c_, f_) => c_.copy(to = f_))
    def state: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[io.dapr.State]] = field(_.state)((c_, f_) => c_.copy(state = f_))
    def concurrency: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.concurrency)((c_, f_) => c_.copy(concurrency = f_))
  }
  final val DATA_FIELD_NUMBER = 1
  final val TO_FIELD_NUMBER = 2
  final val STATE_FIELD_NUMBER = 3
  final val CONCURRENCY_FIELD_NUMBER = 4
  def of(
    data: _root_.scala.Option[com.google.protobuf.any.Any],
    to: _root_.scala.Seq[_root_.scala.Predef.String],
    state: _root_.scala.Seq[io.dapr.State],
    concurrency: _root_.scala.Predef.String
  ): _root_.io.dapr.BindingResponseEnvelope = _root_.io.dapr.BindingResponseEnvelope(
    data,
    to,
    state,
    concurrency
  )
}
