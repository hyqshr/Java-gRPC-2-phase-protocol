// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package gRPC;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gRPC_putRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gRPC_putRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gRPC_getRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gRPC_getRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gRPC_deleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gRPC_deleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gRPC_putResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gRPC_putResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gRPC_getResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gRPC_getResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gRPC_deleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gRPC_deleteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\004gRPC\"&\n\nputRequest\022\013\n\003k" +
      "ey\030\001 \001(\t\022\013\n\003val\030\002 \001(\t\"\031\n\ngetRequest\022\013\n\003k" +
      "ey\030\001 \001(\t\"\034\n\rdeleteRequest\022\013\n\003key\030\001 \001(\t\"\"" +
      "\n\013putResponse\022\023\n\013responseMsg\030\001 \001(\t\"\"\n\013ge" +
      "tResponse\022\023\n\013responseMsg\030\001 \001(\t\"%\n\016delete" +
      "Response\022\023\n\013responseMsg\030\001 \001(\t28\n\nputServ" +
      "ice\022*\n\003put\022\020.gRPC.putRequest\032\021.gRPC.putR" +
      "esponse28\n\ngetService\022*\n\003get\022\020.gRPC.getR" +
      "equest\032\021.gRPC.getResponse2D\n\rdeleteServi" +
      "ce\0223\n\006delete\022\023.gRPC.deleteRequest\032\024.gRPC" +
      ".deleteResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_gRPC_putRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gRPC_putRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gRPC_putRequest_descriptor,
        new java.lang.String[] { "Key", "Val", });
    internal_static_gRPC_getRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_gRPC_getRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gRPC_getRequest_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_gRPC_deleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_gRPC_deleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gRPC_deleteRequest_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_gRPC_putResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_gRPC_putResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gRPC_putResponse_descriptor,
        new java.lang.String[] { "ResponseMsg", });
    internal_static_gRPC_getResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_gRPC_getResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gRPC_getResponse_descriptor,
        new java.lang.String[] { "ResponseMsg", });
    internal_static_gRPC_deleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_gRPC_deleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gRPC_deleteResponse_descriptor,
        new java.lang.String[] { "ResponseMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
