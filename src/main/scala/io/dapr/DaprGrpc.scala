package io.dapr

object DaprGrpc {
  val METHOD_PUBLISH_EVENT: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.PublishEventEnvelope, _root_.com.google.protobuf.empty.Empty] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("dapr.Dapr", "PublishEvent"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.PublishEventEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.com.google.protobuf.empty.Empty])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprProto.javaDescriptor.getServices.get(0).getMethods.get(0)))
      .build()
  
  val METHOD_INVOKE_SERVICE: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.InvokeServiceEnvelope, _root_.io.dapr.InvokeServiceResponseEnvelope] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("dapr.Dapr", "InvokeService"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.InvokeServiceEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.InvokeServiceResponseEnvelope])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprProto.javaDescriptor.getServices.get(0).getMethods.get(1)))
      .build()
  
  val METHOD_INVOKE_BINDING: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.InvokeBindingEnvelope, _root_.com.google.protobuf.empty.Empty] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("dapr.Dapr", "InvokeBinding"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.InvokeBindingEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.com.google.protobuf.empty.Empty])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprProto.javaDescriptor.getServices.get(0).getMethods.get(2)))
      .build()
  
  val METHOD_GET_STATE: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.GetStateEnvelope, _root_.io.dapr.GetStateResponseEnvelope] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("dapr.Dapr", "GetState"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.GetStateEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.GetStateResponseEnvelope])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprProto.javaDescriptor.getServices.get(0).getMethods.get(3)))
      .build()
  
  val METHOD_SAVE_STATE: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.SaveStateEnvelope, _root_.com.google.protobuf.empty.Empty] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("dapr.Dapr", "SaveState"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.SaveStateEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.com.google.protobuf.empty.Empty])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprProto.javaDescriptor.getServices.get(0).getMethods.get(4)))
      .build()
  
  val METHOD_DELETE_STATE: _root_.io.grpc.MethodDescriptor[_root_.io.dapr.DeleteStateEnvelope, _root_.com.google.protobuf.empty.Empty] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("dapr.Dapr", "DeleteState"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.io.dapr.DeleteStateEnvelope])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[_root_.com.google.protobuf.empty.Empty])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.dapr.DaprProto.javaDescriptor.getServices.get(0).getMethods.get(5)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("dapr.Dapr")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(io.dapr.DaprProto.javaDescriptor))
      .addMethod(METHOD_PUBLISH_EVENT)
      .addMethod(METHOD_INVOKE_SERVICE)
      .addMethod(METHOD_INVOKE_BINDING)
      .addMethod(METHOD_GET_STATE)
      .addMethod(METHOD_SAVE_STATE)
      .addMethod(METHOD_DELETE_STATE)
      .build()
  
  /** Dapr definitions
    */
  trait Dapr extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = Dapr
    def publishEvent(request: _root_.io.dapr.PublishEventEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty]
    def invokeService(request: _root_.io.dapr.InvokeServiceEnvelope): scala.concurrent.Future[_root_.io.dapr.InvokeServiceResponseEnvelope]
    def invokeBinding(request: _root_.io.dapr.InvokeBindingEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty]
    def getState(request: _root_.io.dapr.GetStateEnvelope): scala.concurrent.Future[_root_.io.dapr.GetStateResponseEnvelope]
    def saveState(request: _root_.io.dapr.SaveStateEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty]
    def deleteState(request: _root_.io.dapr.DeleteStateEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty]
  }
  
  object Dapr extends _root_.scalapb.grpc.ServiceCompanion[Dapr] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[Dapr] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = io.dapr.DaprProto.javaDescriptor.getServices().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = DaprProto.scalaDescriptor.services(0)
  }
  
  /** Dapr definitions
    */
  trait DaprBlockingClient {
    def serviceCompanion = Dapr
    def publishEvent(request: _root_.io.dapr.PublishEventEnvelope): _root_.com.google.protobuf.empty.Empty
    def invokeService(request: _root_.io.dapr.InvokeServiceEnvelope): _root_.io.dapr.InvokeServiceResponseEnvelope
    def invokeBinding(request: _root_.io.dapr.InvokeBindingEnvelope): _root_.com.google.protobuf.empty.Empty
    def getState(request: _root_.io.dapr.GetStateEnvelope): _root_.io.dapr.GetStateResponseEnvelope
    def saveState(request: _root_.io.dapr.SaveStateEnvelope): _root_.com.google.protobuf.empty.Empty
    def deleteState(request: _root_.io.dapr.DeleteStateEnvelope): _root_.com.google.protobuf.empty.Empty
  }
  
  class DaprBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[DaprBlockingStub](channel, options) with DaprBlockingClient {
    override def publishEvent(request: _root_.io.dapr.PublishEventEnvelope): _root_.com.google.protobuf.empty.Empty = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_PUBLISH_EVENT, options, request)
    }
    
    override def invokeService(request: _root_.io.dapr.InvokeServiceEnvelope): _root_.io.dapr.InvokeServiceResponseEnvelope = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_INVOKE_SERVICE, options, request)
    }
    
    override def invokeBinding(request: _root_.io.dapr.InvokeBindingEnvelope): _root_.com.google.protobuf.empty.Empty = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_INVOKE_BINDING, options, request)
    }
    
    override def getState(request: _root_.io.dapr.GetStateEnvelope): _root_.io.dapr.GetStateResponseEnvelope = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_GET_STATE, options, request)
    }
    
    override def saveState(request: _root_.io.dapr.SaveStateEnvelope): _root_.com.google.protobuf.empty.Empty = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_SAVE_STATE, options, request)
    }
    
    override def deleteState(request: _root_.io.dapr.DeleteStateEnvelope): _root_.com.google.protobuf.empty.Empty = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_DELETE_STATE, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): DaprBlockingStub = new DaprBlockingStub(channel, options)
  }
  
  class DaprStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[DaprStub](channel, options) with Dapr {
    override def publishEvent(request: _root_.io.dapr.PublishEventEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_PUBLISH_EVENT, options, request)
    }
    
    override def invokeService(request: _root_.io.dapr.InvokeServiceEnvelope): scala.concurrent.Future[_root_.io.dapr.InvokeServiceResponseEnvelope] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_INVOKE_SERVICE, options, request)
    }
    
    override def invokeBinding(request: _root_.io.dapr.InvokeBindingEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_INVOKE_BINDING, options, request)
    }
    
    override def getState(request: _root_.io.dapr.GetStateEnvelope): scala.concurrent.Future[_root_.io.dapr.GetStateResponseEnvelope] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_GET_STATE, options, request)
    }
    
    override def saveState(request: _root_.io.dapr.SaveStateEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_SAVE_STATE, options, request)
    }
    
    override def deleteState(request: _root_.io.dapr.DeleteStateEnvelope): scala.concurrent.Future[_root_.com.google.protobuf.empty.Empty] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_DELETE_STATE, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): DaprStub = new DaprStub(channel, options)
  }
  
  def bindService(serviceImpl: Dapr, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_PUBLISH_EVENT,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.PublishEventEnvelope, _root_.com.google.protobuf.empty.Empty] {
        override def invoke(request: _root_.io.dapr.PublishEventEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.com.google.protobuf.empty.Empty]): Unit =
          serviceImpl.publishEvent(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_INVOKE_SERVICE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.InvokeServiceEnvelope, _root_.io.dapr.InvokeServiceResponseEnvelope] {
        override def invoke(request: _root_.io.dapr.InvokeServiceEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.io.dapr.InvokeServiceResponseEnvelope]): Unit =
          serviceImpl.invokeService(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_INVOKE_BINDING,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.InvokeBindingEnvelope, _root_.com.google.protobuf.empty.Empty] {
        override def invoke(request: _root_.io.dapr.InvokeBindingEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.com.google.protobuf.empty.Empty]): Unit =
          serviceImpl.invokeBinding(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_STATE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.GetStateEnvelope, _root_.io.dapr.GetStateResponseEnvelope] {
        override def invoke(request: _root_.io.dapr.GetStateEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.io.dapr.GetStateResponseEnvelope]): Unit =
          serviceImpl.getState(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_SAVE_STATE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.SaveStateEnvelope, _root_.com.google.protobuf.empty.Empty] {
        override def invoke(request: _root_.io.dapr.SaveStateEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.com.google.protobuf.empty.Empty]): Unit =
          serviceImpl.saveState(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_DELETE_STATE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[_root_.io.dapr.DeleteStateEnvelope, _root_.com.google.protobuf.empty.Empty] {
        override def invoke(request: _root_.io.dapr.DeleteStateEnvelope, observer: _root_.io.grpc.stub.StreamObserver[_root_.com.google.protobuf.empty.Empty]): Unit =
          serviceImpl.deleteState(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): DaprBlockingStub = new DaprBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): DaprStub = new DaprStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = io.dapr.DaprProto.javaDescriptor.getServices().get(0)
  
}