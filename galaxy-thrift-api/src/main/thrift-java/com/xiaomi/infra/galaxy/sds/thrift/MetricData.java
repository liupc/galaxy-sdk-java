/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
/**
 * 客户端metrics数据结构
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-20")
public class MetricData implements libthrift091.TBase<MetricData, MetricData._Fields>, java.io.Serializable, Cloneable, Comparable<MetricData> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("MetricData");

  private static final libthrift091.protocol.TField CLIENT_METRIC_TYPE_FIELD_DESC = new libthrift091.protocol.TField("clientMetricType", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField METRIC_NAME_FIELD_DESC = new libthrift091.protocol.TField("metricName", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField VALUE_FIELD_DESC = new libthrift091.protocol.TField("value", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField TIME_STAMP_FIELD_DESC = new libthrift091.protocol.TField("timeStamp", libthrift091.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetricDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetricDataTupleSchemeFactory());
  }

  /**
   * 设置/获取metrics的类型
   * 
   * @see ClientMetricType
   */
  public ClientMetricType clientMetricType; // optional
  /**
   * 客户端请求调用的接口名称.实际计算的数据类型
   * e.g. createTable.ExecutionTime
   */
  public String metricName; // optional
  /**
   * 实际计算的数值
   */
  public long value; // optional
  /**
   * 客户端请求返回的时间戳
   */
  public long timeStamp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 设置/获取metrics的类型
     * 
     * @see ClientMetricType
     */
    CLIENT_METRIC_TYPE((short)1, "clientMetricType"),
    /**
     * 客户端请求调用的接口名称.实际计算的数据类型
     * e.g. createTable.ExecutionTime
     */
    METRIC_NAME((short)2, "metricName"),
    /**
     * 实际计算的数值
     */
    VALUE((short)3, "value"),
    /**
     * 客户端请求返回的时间戳
     */
    TIME_STAMP((short)4, "timeStamp");

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
        case 1: // CLIENT_METRIC_TYPE
          return CLIENT_METRIC_TYPE;
        case 2: // METRIC_NAME
          return METRIC_NAME;
        case 3: // VALUE
          return VALUE;
        case 4: // TIME_STAMP
          return TIME_STAMP;
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
  private static final int __VALUE_ISSET_ID = 0;
  private static final int __TIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CLIENT_METRIC_TYPE,_Fields.METRIC_NAME,_Fields.VALUE,_Fields.TIME_STAMP};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLIENT_METRIC_TYPE, new libthrift091.meta_data.FieldMetaData("clientMetricType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, ClientMetricType.class)));
    tmpMap.put(_Fields.METRIC_NAME, new libthrift091.meta_data.FieldMetaData("metricName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new libthrift091.meta_data.FieldMetaData("value", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.TIME_STAMP, new libthrift091.meta_data.FieldMetaData("timeStamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(MetricData.class, metaDataMap);
  }

  public MetricData() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricData(MetricData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetClientMetricType()) {
      this.clientMetricType = other.clientMetricType;
    }
    if (other.isSetMetricName()) {
      this.metricName = other.metricName;
    }
    this.value = other.value;
    this.timeStamp = other.timeStamp;
  }

  public MetricData deepCopy() {
    return new MetricData(this);
  }

  @Override
  public void clear() {
    this.clientMetricType = null;
    this.metricName = null;
    setValueIsSet(false);
    this.value = 0;
    setTimeStampIsSet(false);
    this.timeStamp = 0;
  }

  /**
   * 设置/获取metrics的类型
   * 
   * @see ClientMetricType
   */
  public ClientMetricType getClientMetricType() {
    return this.clientMetricType;
  }

  /**
   * 设置/获取metrics的类型
   * 
   * @see ClientMetricType
   */
  public MetricData setClientMetricType(ClientMetricType clientMetricType) {
    this.clientMetricType = clientMetricType;
    return this;
  }

  public void unsetClientMetricType() {
    this.clientMetricType = null;
  }

  /** Returns true if field clientMetricType is set (has been assigned a value) and false otherwise */
  public boolean isSetClientMetricType() {
    return this.clientMetricType != null;
  }

  public void setClientMetricTypeIsSet(boolean value) {
    if (!value) {
      this.clientMetricType = null;
    }
  }

  /**
   * 客户端请求调用的接口名称.实际计算的数据类型
   * e.g. createTable.ExecutionTime
   */
  public String getMetricName() {
    return this.metricName;
  }

  /**
   * 客户端请求调用的接口名称.实际计算的数据类型
   * e.g. createTable.ExecutionTime
   */
  public MetricData setMetricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

  public void unsetMetricName() {
    this.metricName = null;
  }

  /** Returns true if field metricName is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricName() {
    return this.metricName != null;
  }

  public void setMetricNameIsSet(boolean value) {
    if (!value) {
      this.metricName = null;
    }
  }

  /**
   * 实际计算的数值
   */
  public long getValue() {
    return this.value;
  }

  /**
   * 实际计算的数值
   */
  public MetricData setValue(long value) {
    this.value = value;
    setValueIsSet(true);
    return this;
  }

  public void unsetValue() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
  }

  /**
   * 客户端请求返回的时间戳
   */
  public long getTimeStamp() {
    return this.timeStamp;
  }

  /**
   * 客户端请求返回的时间戳
   */
  public MetricData setTimeStamp(long timeStamp) {
    this.timeStamp = timeStamp;
    setTimeStampIsSet(true);
    return this;
  }

  public void unsetTimeStamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timeStamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeStamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimeStampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLIENT_METRIC_TYPE:
      if (value == null) {
        unsetClientMetricType();
      } else {
        setClientMetricType((ClientMetricType)value);
      }
      break;

    case METRIC_NAME:
      if (value == null) {
        unsetMetricName();
      } else {
        setMetricName((String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((Long)value);
      }
      break;

    case TIME_STAMP:
      if (value == null) {
        unsetTimeStamp();
      } else {
        setTimeStamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLIENT_METRIC_TYPE:
      return getClientMetricType();

    case METRIC_NAME:
      return getMetricName();

    case VALUE:
      return Long.valueOf(getValue());

    case TIME_STAMP:
      return Long.valueOf(getTimeStamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLIENT_METRIC_TYPE:
      return isSetClientMetricType();
    case METRIC_NAME:
      return isSetMetricName();
    case VALUE:
      return isSetValue();
    case TIME_STAMP:
      return isSetTimeStamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricData)
      return this.equals((MetricData)that);
    return false;
  }

  public boolean equals(MetricData that) {
    if (that == null)
      return false;

    boolean this_present_clientMetricType = true && this.isSetClientMetricType();
    boolean that_present_clientMetricType = true && that.isSetClientMetricType();
    if (this_present_clientMetricType || that_present_clientMetricType) {
      if (!(this_present_clientMetricType && that_present_clientMetricType))
        return false;
      if (!this.clientMetricType.equals(that.clientMetricType))
        return false;
    }

    boolean this_present_metricName = true && this.isSetMetricName();
    boolean that_present_metricName = true && that.isSetMetricName();
    if (this_present_metricName || that_present_metricName) {
      if (!(this_present_metricName && that_present_metricName))
        return false;
      if (!this.metricName.equals(that.metricName))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (this.value != that.value)
        return false;
    }

    boolean this_present_timeStamp = true && this.isSetTimeStamp();
    boolean that_present_timeStamp = true && that.isSetTimeStamp();
    if (this_present_timeStamp || that_present_timeStamp) {
      if (!(this_present_timeStamp && that_present_timeStamp))
        return false;
      if (this.timeStamp != that.timeStamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_clientMetricType = true && (isSetClientMetricType());
    list.add(present_clientMetricType);
    if (present_clientMetricType)
      list.add(clientMetricType.getValue());

    boolean present_metricName = true && (isSetMetricName());
    list.add(present_metricName);
    if (present_metricName)
      list.add(metricName);

    boolean present_value = true && (isSetValue());
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_timeStamp = true && (isSetTimeStamp());
    list.add(present_timeStamp);
    if (present_timeStamp)
      list.add(timeStamp);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetricData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClientMetricType()).compareTo(other.isSetClientMetricType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientMetricType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.clientMetricType, other.clientMetricType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetricName()).compareTo(other.isSetMetricName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metricName, other.metricName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeStamp()).compareTo(other.isSetTimeStamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeStamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.timeStamp, other.timeStamp);
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
    StringBuilder sb = new StringBuilder("MetricData(");
    boolean first = true;

    if (isSetClientMetricType()) {
      sb.append("clientMetricType:");
      if (this.clientMetricType == null) {
        sb.append("null");
      } else {
        sb.append(this.clientMetricType);
      }
      first = false;
    }
    if (isSetMetricName()) {
      if (!first) sb.append(", ");
      sb.append("metricName:");
      if (this.metricName == null) {
        sb.append("null");
      } else {
        sb.append(this.metricName);
      }
      first = false;
    }
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      sb.append(this.value);
      first = false;
    }
    if (isSetTimeStamp()) {
      if (!first) sb.append(", ");
      sb.append("timeStamp:");
      sb.append(this.timeStamp);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class MetricDataStandardSchemeFactory implements SchemeFactory {
    public MetricDataStandardScheme getScheme() {
      return new MetricDataStandardScheme();
    }
  }

  private static class MetricDataStandardScheme extends StandardScheme<MetricData> {

    public void read(libthrift091.protocol.TProtocol iprot, MetricData struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLIENT_METRIC_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.clientMetricType = com.xiaomi.infra.galaxy.sds.thrift.ClientMetricType.findByValue(iprot.readI32());
              struct.setClientMetricTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METRIC_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.metricName = iprot.readString();
              struct.setMetricNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.value = iprot.readI64();
              struct.setValueIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIME_STAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.timeStamp = iprot.readI64();
              struct.setTimeStampIsSet(true);
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
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, MetricData struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.clientMetricType != null) {
        if (struct.isSetClientMetricType()) {
          oprot.writeFieldBegin(CLIENT_METRIC_TYPE_FIELD_DESC);
          oprot.writeI32(struct.clientMetricType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.metricName != null) {
        if (struct.isSetMetricName()) {
          oprot.writeFieldBegin(METRIC_NAME_FIELD_DESC);
          oprot.writeString(struct.metricName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetValue()) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeI64(struct.value);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimeStamp()) {
        oprot.writeFieldBegin(TIME_STAMP_FIELD_DESC);
        oprot.writeI64(struct.timeStamp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetricDataTupleSchemeFactory implements SchemeFactory {
    public MetricDataTupleScheme getScheme() {
      return new MetricDataTupleScheme();
    }
  }

  private static class MetricDataTupleScheme extends TupleScheme<MetricData> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, MetricData struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetClientMetricType()) {
        optionals.set(0);
      }
      if (struct.isSetMetricName()) {
        optionals.set(1);
      }
      if (struct.isSetValue()) {
        optionals.set(2);
      }
      if (struct.isSetTimeStamp()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetClientMetricType()) {
        oprot.writeI32(struct.clientMetricType.getValue());
      }
      if (struct.isSetMetricName()) {
        oprot.writeString(struct.metricName);
      }
      if (struct.isSetValue()) {
        oprot.writeI64(struct.value);
      }
      if (struct.isSetTimeStamp()) {
        oprot.writeI64(struct.timeStamp);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, MetricData struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.clientMetricType = com.xiaomi.infra.galaxy.sds.thrift.ClientMetricType.findByValue(iprot.readI32());
        struct.setClientMetricTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.metricName = iprot.readString();
        struct.setMetricNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.value = iprot.readI64();
        struct.setValueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.timeStamp = iprot.readI64();
        struct.setTimeStampIsSet(true);
      }
    }
  }

}

