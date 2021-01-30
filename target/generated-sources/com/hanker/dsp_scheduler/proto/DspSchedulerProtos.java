// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: objects.proto

package com.hanker.dsp_scheduler.proto;

public final class DspSchedulerProtos {
  private DspSchedulerProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hanker_dsp_scheduler_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hanker_dsp_scheduler_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hanker_dsp_scheduler_Building_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hanker_dsp_scheduler_Building_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hanker_dsp_scheduler_Recipe_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hanker_dsp_scheduler_Recipe_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hanker_dsp_scheduler_Ingredient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hanker_dsp_scheduler_Ingredient_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\robjects.proto\022\024hanker.dsp_scheduler\";\n" +
      "\004Item\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t" +
      "\022\020\n\010used_for\030\003 \003(\t\"W\n\010Building\022\014\n\004name\030\001" +
      " \001(\t\022\022\n\nidle_power\030\002 \001(\005\022\022\n\nfull_power\030\003" +
      " \001(\005\022\025\n\rproduce_speed\030\004 \001(\002\"\235\001\n\006Recipe\0221" +
      "\n\007outputs\030\001 \003(\0132 .hanker.dsp_scheduler.I" +
      "ngredient\0220\n\006inputs\030\002 \003(\0132 .hanker.dsp_s" +
      "cheduler.Ingredient\022\025\n\rbuilding_name\030\003 \001" +
      "(\t\022\027\n\017processing_time\030\004 \001(\002\"Z\n\nIngredien" +
      "t\022\023\n\titem_name\030\001 \001(\tH\000\022\027\n\rbuilding_name\030",
      "\002 \001(\tH\000\022\020\n\010quantity\030\003 \001(\005B\014\n\nname_oneofB" +
      "6\n\036com.hanker.dsp_scheduler.protoB\022DspSc" +
      "hedulerProtosP\001b\006proto3"
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
    internal_static_hanker_dsp_scheduler_Item_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hanker_dsp_scheduler_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hanker_dsp_scheduler_Item_descriptor,
        new java.lang.String[] { "Name", "Description", "UsedFor", });
    internal_static_hanker_dsp_scheduler_Building_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hanker_dsp_scheduler_Building_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hanker_dsp_scheduler_Building_descriptor,
        new java.lang.String[] { "Name", "IdlePower", "FullPower", "ProduceSpeed", });
    internal_static_hanker_dsp_scheduler_Recipe_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hanker_dsp_scheduler_Recipe_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hanker_dsp_scheduler_Recipe_descriptor,
        new java.lang.String[] { "Outputs", "Inputs", "BuildingName", "ProcessingTime", });
    internal_static_hanker_dsp_scheduler_Ingredient_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hanker_dsp_scheduler_Ingredient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hanker_dsp_scheduler_Ingredient_descriptor,
        new java.lang.String[] { "ItemName", "BuildingName", "Quantity", "NameOneof", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}