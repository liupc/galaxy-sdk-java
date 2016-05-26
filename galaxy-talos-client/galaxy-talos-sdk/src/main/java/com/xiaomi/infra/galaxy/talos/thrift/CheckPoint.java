/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-26")
public class CheckPoint implements libthrift091.TBase<CheckPoint, CheckPoint._Fields>, java.io.Serializable, Cloneable, Comparable<CheckPoint> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("CheckPoint");

  private static final libthrift091.protocol.TField CONSUMER_GROUP_FIELD_DESC = new libthrift091.protocol.TField("consumerGroup", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TOPIC_AND_PARTITION_FIELD_DESC = new libthrift091.protocol.TField("topicAndPartition", libthrift091.protocol.TType.STRUCT, (short)2);
  private static final libthrift091.protocol.TField MSG_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("msgOffset", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField WORKER_ID_FIELD_DESC = new libthrift091.protocol.TField("workerId", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField LAST_COMMIT_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("lastCommitOffset", libthrift091.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CheckPointStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CheckPointTupleSchemeFactory());
  }

  /**
   * consumerGroup name
   * 
   */
  public String consumerGroup; // required
  /**
   * topicAndPartition
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition; // required
  /**
   * message offset
   * 
   */
  public long msgOffset; // required
  /**
   * worker id
   * 
   */
  public String workerId; // required
  /**
   * last commit offset
   * 
   */
  public long lastCommitOffset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * consumerGroup name
     * 
     */
    CONSUMER_GROUP((short)1, "consumerGroup"),
    /**
     * topicAndPartition
     * 
     */
    TOPIC_AND_PARTITION((short)2, "topicAndPartition"),
    /**
     * message offset
     * 
     */
    MSG_OFFSET((short)3, "msgOffset"),
    /**
     * worker id
     * 
     */
    WORKER_ID((short)4, "workerId"),
    /**
     * last commit offset
     * 
     */
    LAST_COMMIT_OFFSET((short)5, "lastCommitOffset");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CONSUMER_GROUP
          return CONSUMER_GROUP;
        case 2: // TOPIC_AND_PARTITION
          return TOPIC_AND_PARTITION;
        case 3: // MSG_OFFSET
          return MSG_OFFSET;
        case 4: // WORKER_ID
          return WORKER_ID;
        case 5: // LAST_COMMIT_OFFSET
          return LAST_COMMIT_OFFSET;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MSGOFFSET_ISSET_ID = 0;
  private static final int __LASTCOMMITOFFSET_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LAST_COMMIT_OFFSET};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONSUMER_GROUP, new libthrift091.meta_data.FieldMetaData("consumerGroup", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOPIC_AND_PARTITION, new libthrift091.meta_data.FieldMetaData("topicAndPartition", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition.class)));
    tmpMap.put(_Fields.MSG_OFFSET, new libthrift091.meta_data.FieldMetaData("msgOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.WORKER_ID, new libthrift091.meta_data.FieldMetaData("workerId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_COMMIT_OFFSET, new libthrift091.meta_data.FieldMetaData("lastCommitOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(CheckPoint.class, metaDataMap);
  }

  public CheckPoint() {
  }

  public CheckPoint(
    String consumerGroup,
    com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition,
    long msgOffset,
    String workerId)
  {
    this();
    this.consumerGroup = consumerGroup;
    this.topicAndPartition = topicAndPartition;
    this.msgOffset = msgOffset;
    setMsgOffsetIsSet(true);
    this.workerId = workerId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckPoint(CheckPoint other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetConsumerGroup()) {
      this.consumerGroup = other.consumerGroup;
    }
    if (other.isSetTopicAndPartition()) {
      this.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition(other.topicAndPartition);
    }
    this.msgOffset = other.msgOffset;
    if (other.isSetWorkerId()) {
      this.workerId = other.workerId;
    }
    this.lastCommitOffset = other.lastCommitOffset;
  }

  public CheckPoint deepCopy() {
    return new CheckPoint(this);
  }

  @Override
  public void clear() {
    this.consumerGroup = null;
    this.topicAndPartition = null;
    setMsgOffsetIsSet(false);
    this.msgOffset = 0;
    this.workerId = null;
    setLastCommitOffsetIsSet(false);
    this.lastCommitOffset = 0;
  }

  /**
   * consumerGroup name
   * 
   */
  public String getConsumerGroup() {
    return this.consumerGroup;
  }

  /**
   * consumerGroup name
   * 
   */
  public CheckPoint setConsumerGroup(String consumerGroup) {
    this.consumerGroup = consumerGroup;
    return this;
  }

  public void unsetConsumerGroup() {
    this.consumerGroup = null;
  }

  /** Returns true if field consumerGroup is set (has been assigned a value) and false otherwise */
  public boolean isSetConsumerGroup() {
    return this.consumerGroup != null;
  }

  public void setConsumerGroupIsSet(boolean value) {
    if (!value) {
      this.consumerGroup = null;
    }
  }

  /**
   * topicAndPartition
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition getTopicAndPartition() {
    return this.topicAndPartition;
  }

  /**
   * topicAndPartition
   * 
   */
  public CheckPoint setTopicAndPartition(com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition) {
    this.topicAndPartition = topicAndPartition;
    return this;
  }

  public void unsetTopicAndPartition() {
    this.topicAndPartition = null;
  }

  /** Returns true if field topicAndPartition is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAndPartition() {
    return this.topicAndPartition != null;
  }

  public void setTopicAndPartitionIsSet(boolean value) {
    if (!value) {
      this.topicAndPartition = null;
    }
  }

  /**
   * message offset
   * 
   */
  public long getMsgOffset() {
    return this.msgOffset;
  }

  /**
   * message offset
   * 
   */
  public CheckPoint setMsgOffset(long msgOffset) {
    this.msgOffset = msgOffset;
    setMsgOffsetIsSet(true);
    return this;
  }

  public void unsetMsgOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MSGOFFSET_ISSET_ID);
  }

  /** Returns true if field msgOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetMsgOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __MSGOFFSET_ISSET_ID);
  }

  public void setMsgOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MSGOFFSET_ISSET_ID, value);
  }

  /**
   * worker id
   * 
   */
  public String getWorkerId() {
    return this.workerId;
  }

  /**
   * worker id
   * 
   */
  public CheckPoint setWorkerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  public void unsetWorkerId() {
    this.workerId = null;
  }

  /** Returns true if field workerId is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkerId() {
    return this.workerId != null;
  }

  public void setWorkerIdIsSet(boolean value) {
    if (!value) {
      this.workerId = null;
    }
  }

  /**
   * last commit offset
   * 
   */
  public long getLastCommitOffset() {
    return this.lastCommitOffset;
  }

  /**
   * last commit offset
   * 
   */
  public CheckPoint setLastCommitOffset(long lastCommitOffset) {
    this.lastCommitOffset = lastCommitOffset;
    setLastCommitOffsetIsSet(true);
    return this;
  }

  public void unsetLastCommitOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTCOMMITOFFSET_ISSET_ID);
  }

  /** Returns true if field lastCommitOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetLastCommitOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTCOMMITOFFSET_ISSET_ID);
  }

  public void setLastCommitOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTCOMMITOFFSET_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONSUMER_GROUP:
      if (value == null) {
        unsetConsumerGroup();
      } else {
        setConsumerGroup((String)value);
      }
      break;

    case TOPIC_AND_PARTITION:
      if (value == null) {
        unsetTopicAndPartition();
      } else {
        setTopicAndPartition((com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition)value);
      }
      break;

    case MSG_OFFSET:
      if (value == null) {
        unsetMsgOffset();
      } else {
        setMsgOffset((Long)value);
      }
      break;

    case WORKER_ID:
      if (value == null) {
        unsetWorkerId();
      } else {
        setWorkerId((String)value);
      }
      break;

    case LAST_COMMIT_OFFSET:
      if (value == null) {
        unsetLastCommitOffset();
      } else {
        setLastCommitOffset((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONSUMER_GROUP:
      return getConsumerGroup();

    case TOPIC_AND_PARTITION:
      return getTopicAndPartition();

    case MSG_OFFSET:
      return Long.valueOf(getMsgOffset());

    case WORKER_ID:
      return getWorkerId();

    case LAST_COMMIT_OFFSET:
      return Long.valueOf(getLastCommitOffset());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONSUMER_GROUP:
      return isSetConsumerGroup();
    case TOPIC_AND_PARTITION:
      return isSetTopicAndPartition();
    case MSG_OFFSET:
      return isSetMsgOffset();
    case WORKER_ID:
      return isSetWorkerId();
    case LAST_COMMIT_OFFSET:
      return isSetLastCommitOffset();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CheckPoint)
      return this.equals((CheckPoint)that);
    return false;
  }

  public boolean equals(CheckPoint that) {
    if (that == null)
      return false;

    boolean this_present_consumerGroup = true && this.isSetConsumerGroup();
    boolean that_present_consumerGroup = true && that.isSetConsumerGroup();
    if (this_present_consumerGroup || that_present_consumerGroup) {
      if (!(this_present_consumerGroup && that_present_consumerGroup))
        return false;
      if (!this.consumerGroup.equals(that.consumerGroup))
        return false;
    }

    boolean this_present_topicAndPartition = true && this.isSetTopicAndPartition();
    boolean that_present_topicAndPartition = true && that.isSetTopicAndPartition();
    if (this_present_topicAndPartition || that_present_topicAndPartition) {
      if (!(this_present_topicAndPartition && that_present_topicAndPartition))
        return false;
      if (!this.topicAndPartition.equals(that.topicAndPartition))
        return false;
    }

    boolean this_present_msgOffset = true;
    boolean that_present_msgOffset = true;
    if (this_present_msgOffset || that_present_msgOffset) {
      if (!(this_present_msgOffset && that_present_msgOffset))
        return false;
      if (this.msgOffset != that.msgOffset)
        return false;
    }

    boolean this_present_workerId = true && this.isSetWorkerId();
    boolean that_present_workerId = true && that.isSetWorkerId();
    if (this_present_workerId || that_present_workerId) {
      if (!(this_present_workerId && that_present_workerId))
        return false;
      if (!this.workerId.equals(that.workerId))
        return false;
    }

    boolean this_present_lastCommitOffset = true && this.isSetLastCommitOffset();
    boolean that_present_lastCommitOffset = true && that.isSetLastCommitOffset();
    if (this_present_lastCommitOffset || that_present_lastCommitOffset) {
      if (!(this_present_lastCommitOffset && that_present_lastCommitOffset))
        return false;
      if (this.lastCommitOffset != that.lastCommitOffset)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_consumerGroup = true && (isSetConsumerGroup());
    list.add(present_consumerGroup);
    if (present_consumerGroup)
      list.add(consumerGroup);

    boolean present_topicAndPartition = true && (isSetTopicAndPartition());
    list.add(present_topicAndPartition);
    if (present_topicAndPartition)
      list.add(topicAndPartition);

    boolean present_msgOffset = true;
    list.add(present_msgOffset);
    if (present_msgOffset)
      list.add(msgOffset);

    boolean present_workerId = true && (isSetWorkerId());
    list.add(present_workerId);
    if (present_workerId)
      list.add(workerId);

    boolean present_lastCommitOffset = true && (isSetLastCommitOffset());
    list.add(present_lastCommitOffset);
    if (present_lastCommitOffset)
      list.add(lastCommitOffset);

    return list.hashCode();
  }

  @Override
  public int compareTo(CheckPoint other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConsumerGroup()).compareTo(other.isSetConsumerGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsumerGroup()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consumerGroup, other.consumerGroup);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicAndPartition()).compareTo(other.isSetTopicAndPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAndPartition()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAndPartition, other.topicAndPartition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsgOffset()).compareTo(other.isSetMsgOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsgOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.msgOffset, other.msgOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWorkerId()).compareTo(other.isSetWorkerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkerId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.workerId, other.workerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastCommitOffset()).compareTo(other.isSetLastCommitOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastCommitOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.lastCommitOffset, other.lastCommitOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CheckPoint(");
    boolean first = true;

    sb.append("consumerGroup:");
    if (this.consumerGroup == null) {
      sb.append("null");
    } else {
      sb.append(this.consumerGroup);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicAndPartition:");
    if (this.topicAndPartition == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAndPartition);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("msgOffset:");
    sb.append(this.msgOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("workerId:");
    if (this.workerId == null) {
      sb.append("null");
    } else {
      sb.append(this.workerId);
    }
    first = false;
    if (isSetLastCommitOffset()) {
      if (!first) sb.append(", ");
      sb.append("lastCommitOffset:");
      sb.append(this.lastCommitOffset);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (consumerGroup == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'consumerGroup' was not present! Struct: " + toString());
    }
    if (topicAndPartition == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAndPartition' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'msgOffset' because it's a primitive and you chose the non-beans generator.
    if (workerId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'workerId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicAndPartition != null) {
      topicAndPartition.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CheckPointStandardSchemeFactory implements SchemeFactory {
    public CheckPointStandardScheme getScheme() {
      return new CheckPointStandardScheme();
    }
  }

  private static class CheckPointStandardScheme extends StandardScheme<CheckPoint> {

    public void read(libthrift091.protocol.TProtocol iprot, CheckPoint struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONSUMER_GROUP
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.consumerGroup = iprot.readString();
              struct.setConsumerGroupIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_AND_PARTITION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
              struct.topicAndPartition.read(iprot);
              struct.setTopicAndPartitionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MSG_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.msgOffset = iprot.readI64();
              struct.setMsgOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WORKER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.workerId = iprot.readString();
              struct.setWorkerIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LAST_COMMIT_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.lastCommitOffset = iprot.readI64();
              struct.setLastCommitOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetMsgOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'msgOffset' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, CheckPoint struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.consumerGroup != null) {
        oprot.writeFieldBegin(CONSUMER_GROUP_FIELD_DESC);
        oprot.writeString(struct.consumerGroup);
        oprot.writeFieldEnd();
      }
      if (struct.topicAndPartition != null) {
        oprot.writeFieldBegin(TOPIC_AND_PARTITION_FIELD_DESC);
        struct.topicAndPartition.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MSG_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.msgOffset);
      oprot.writeFieldEnd();
      if (struct.workerId != null) {
        oprot.writeFieldBegin(WORKER_ID_FIELD_DESC);
        oprot.writeString(struct.workerId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLastCommitOffset()) {
        oprot.writeFieldBegin(LAST_COMMIT_OFFSET_FIELD_DESC);
        oprot.writeI64(struct.lastCommitOffset);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CheckPointTupleSchemeFactory implements SchemeFactory {
    public CheckPointTupleScheme getScheme() {
      return new CheckPointTupleScheme();
    }
  }

  private static class CheckPointTupleScheme extends TupleScheme<CheckPoint> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, CheckPoint struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.consumerGroup);
      struct.topicAndPartition.write(oprot);
      oprot.writeI64(struct.msgOffset);
      oprot.writeString(struct.workerId);
      BitSet optionals = new BitSet();
      if (struct.isSetLastCommitOffset()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLastCommitOffset()) {
        oprot.writeI64(struct.lastCommitOffset);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, CheckPoint struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.consumerGroup = iprot.readString();
      struct.setConsumerGroupIsSet(true);
      struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
      struct.topicAndPartition.read(iprot);
      struct.setTopicAndPartitionIsSet(true);
      struct.msgOffset = iprot.readI64();
      struct.setMsgOffsetIsSet(true);
      struct.workerId = iprot.readString();
      struct.setWorkerIdIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.lastCommitOffset = iprot.readI64();
        struct.setLastCommitOffsetIsSet(true);
      }
    }
  }

}

