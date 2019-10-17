package io.dapr

object DaprClientGrpc {
  val METHOD_ON_INVOKE: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.InvokeEnvelope, _root_.com.google.protobuf.any.Any] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("daprclient.DaprClient", "OnInvoke"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.InvokeEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.com.google.protobuf.any.Any])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprclientProto.javaDescriptor.getServices.get(0).getMethods.get(0)))
      .build()
  
  val METHOD_GET_TOPIC_SUBSCRIPTIONS: _root_.io.grpc.MethodDescriptor[_root_.com.google.protobuf.empty.Empty, _root_.io.dapr.GetTopicSubscriptionsEnvelope] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("daprclient.DaprClient", "GetTopicSubscriptions"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.com.google.protobuf.empty.Empty])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.GetTopicSubscriptionsEnvelope])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprclientProto.javaDescriptor.getServices.get(0).getMethods.get(1)))
      .build()
  
  val METHOD_GET_BINDINGS_SUBSCRIPTIONS: _root_.io.grpc.MethodDescriptor[_root_.com.google.protobuf.empty.Empty, _root_.io.dapr.GetBindingsSubscriptionsEnvelope] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("daprclient.DaprClient", "GetBindingsSubscriptions"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.com.google.protobuf.empty.Empty])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.GetBindingsSubscriptionsEnvelope])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprclientProto.javaDescriptor.getServices.get(0).getMethods.get(2)))
      .build()
  
  val METHOD_ON_BINDING_EVENT: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.BindingEventEnvelope, _root_.io.dapr.BindingResponseEnvelope] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("daprclient.DaprClient", "OnBindingEvent"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.BindingEventEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.BindingResponseEnvelope])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprclientProto.javaDescriptor.getServices.get(0).getMethods.get(3)))
      .build()
  
  val METHOD_ON_TOPIC_EVENT: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.CloudEventEnvelope, _root_.com.google.protobuf.empty.Empty] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("daprclient.DaprClient", "OnTopicEvent"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.CloudEventEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.com.google.protobuf.empty.Empty])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprclientProto.javaDescriptor.getServices.get(0).getMethods.get(4)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("daprclient.DaprClient")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(io.dapr.DaprclientProto.javaDescriptor))
      .addMethod(METHOD_ON_INVOKE)
      .addMethod(METHOD_GET_TOPIC_SUBSCRIPTIONS)
      .addMethod(METHOD_GET_BINDINGS_SUBSCRIPTIONS)
      .addMethod(METHOD_ON_BINDING_EVENT)
      .addMethod(METHOD_ON_TOPIC_EVENT)
      .build()
  
  /** User Code definitions
    */
  trait DaprClient extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = DaprClient
    def onInvoke(request: _root_.io.dapr.InvokeEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.any.Any]
    def getTopicSubscriptions(request: _root_.com.google.protobuf.empty.Empty): scala.concurrent.Future[_root_.io.dapr.GetTopicSubscriptionsEnvelope]
    def getBindingsSubscriptions(request: _root_.com.google.protobuf.empty.Empty): scala.concurrent.Future[_root_.io.dapr.GetBindingsSubscriptionsEnvelope]
    def onBindingEvent(request: _root_.io.dapr.BindingEventEnvelope): scala.concurrent.Future[_root_.io.dapr.BindingResponseEnvelope]
    def onTopicEvent(request: _root_.io.dapr.CloudEventEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty]
  }
  
  object DaprClient extends _root_.scalapb.grpc.ServiceCompanion[DaprClient] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[DaprClient] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = io.dapr.DaprclientProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = DaprclientProto.scalaDescriptor.services(0)
  }
  
  /** User Code definitions
    */
  trait DaprClientBlockingClient {
    def serviceCompanion = DaprClient
    def onInvoke(request: _root_.io.dapr.InvokeEnvelope): _root_.com.google.protobuf.any.Any
    def getTopicSubscriptions(request: _root_.com.google.protobuf.empty.Empty): _root_.io.dapr.GetTopicSubscriptionsEnvelope
    def getBindingsSubscriptions(request: _root_.com.google.protobuf.empty.Empty): _root_.io.dapr.GetBindingsSubscriptionsEnvelope
    def onBindingEvent(request: _root_.io.dapr.BindingEventEnvelope): _root_.io.dapr.BindingResponseEnvelope
    def onTopicEvent(request: _root_.io.dapr.CloudEventEnvelope): _root_.com.google.protobuf.empty.Empty
  }
  
  class DaprClientBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[DaprClientBlockingStub](channel, options) with DaprClientBlockingClient {
    override def onInvoke(request: _root_.io.dapr.InvokeEnvelope): _root_.com.google.protobuf.any.Any = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_ON_INVOKE, options, request)
    }
    
    override def getTopicSubscriptions(request: _root_.com.google.protobuf.empty.Empty): _root_.io.dapr.GetTopicSubscriptionsEnvelope = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_TOPIC_SUBSCRIPTIONS, options, request)
    }
    
    override def getBindingsSubscriptions(request: _root_.com.google.protobuf.empty.Empty): _root_.io.dapr.GetBindingsSubscriptionsEnvelope = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_BINDINGS_SUBSCRIPTIONS, options, request)
    }
    
    override def onBindingEvent(request: _root_.io.dapr.BindingEventEnvelope): _root_.io.dapr.BindingResponseEnvelope = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_ON_BINDING_EVENT, options, request)
    }
    
    override def onTopicEvent(request: _root_.io.dapr.CloudEventEnvelope): _root_.com.google.protobuf.empty.Empty = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_ON_TOPIC_EVENT, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): DaprClientBlockingStub = new DaprClientBlockingStub(channel, options)
  }
  
  class DaprClientStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[DaprClientStub](channel, options) with DaprClient {
    override def onInvoke(request: _root_.io.dapr.InvokeEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.any.Any] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_ON_INVOKE, options, request)
    }
    
    override def getTopicSubscriptions(request: _root_.com.google.protobuf.empty.Empty): scala.concurrent.Future[_root_.io.dapr.GetTopicSubscriptionsEnvelope] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_TOPIC_SUBSCRIPTIONS, options, request)
    }
    
    override def getBindingsSubscriptions(request: _root_.com.google.protobuf.empty.Empty): scala.concurrent.Future[_root_.io.dapr.GetBindingsSubscriptionsEnvelope] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_BINDINGS_SUBSCRIPTIONS, options, request)
    }
    
    override def onBindingEvent(request: _root_.io.dapr.BindingEventEnvelope): scala.concurrent.Future[_root_.io.dapr.BindingResponseEnvelope] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_ON_BINDING_EVENT, options, request)
    }
    
    override def onTopicEvent(request: _root_.io.dapr.CloudEventEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_ON_TOPIC_EVENT, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): DaprClientStub = new DaprClientStub(channel, options)
  }
  
  def bindService(serviceImpl: DaprClient, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_ON_INVOKE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.InvokeEnvelope, _root_.com.google.protobuf.any.Any] {
        override def invoke(request: _root_.io.dapr.InvokeEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.com.google.protobuf.any.Any]): Unit =
          serviceImpl.onInvoke(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_TOPIC_SUBSCRIPTIONS,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.com.google.protobuf.empty.Empty, _root_.io.dapr.GetTopicSubscriptionsEnvelope] {
        override def invoke(request: _root_.com.google.protobuf.empty.Empty, observer: _root_.io.grpc.stub.StreamObserver[_root_.io.dapr.GetTopicSubscriptionsEnvelope]): Unit =
          serviceImpl.getTopicSubscriptions(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_BINDINGS_SUBSCRIPTIONS,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.com.google.protobuf.empty.Empty, _root_.io.dapr.GetBindingsSubscriptionsEnvelope] {
        override def invoke(request: _root_.com.google.protobuf.empty.Empty, observer: _root_.io.grpc.stub.StreamObserver[_root_.io.dapr.GetBindingsSubscriptionsEnvelope]): Unit =
          serviceImpl.getBindingsSubscriptions(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_ON_BINDING_EVENT,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.BindingEventEnvelope, _root_.io.dapr.BindingResponseEnvelope] {
        override def invoke(request: _root_.io.dapr.BindingEventEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.io.dapr.BindingResponseEnvelope]): Unit =
          serviceImpl.onBindingEvent(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_ON_TOPIC_EVENT,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.CloudEventEnvelope, _root_.com.google.protobuf.empty.Empty] {
        override def invoke(request: _root_.io.dapr.CloudEventEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.com.google.protobuf.empty.Empty]): Unit =
          serviceImpl.onTopicEvent(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): DaprClientBlockingStub = new DaprClientBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): DaprClientStub = new DaprClientStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = io.dapr.DaprclientProto.javaDescriptor.getServices().get(0)
  
}