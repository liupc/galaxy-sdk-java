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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-20")
public class DataConsumeResult implements libthrift091.TBase<DataConsumeResult, DataConsumeResult._Fields>, java.io.Serializable, Cloneable, Comparable<DataConsumeResult> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DataConsumeResult");

  private static final libthrift091.protocol.TField NEXT_CONSUME_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("nextConsumeOffset", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField RECORDS_FIELD_DESC = new libthrift091.protocol.TField("records", libthrift091.protocol.TType.LIST, (short)2);
  private static final libthrift091.protocol.TField KEYS_FIELD_DESC = new libthrift091.protocol.TField("keys", libthrift091.protocol.TType.LIST, (short)3);
  private static final libthrift091.protocol.TField THROTTLED_FIELD_DESC = new libthrift091.protocol.TField("throttled", libthrift091.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DataConsumeResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DataConsumeResultTupleSchemeFactory());
  }

  /**
   * 下一个开始消费的存量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public Map<String,Datum> nextConsumeOffset; // optional
  /**
   * 消费的存量数据
   */
  public List<Map<String,Datum>> records; // optional
  /**
   * 表的主键属性
   */
  public List<String> keys; // optional
  /**
   * 是否超过表的qps quota
   */
  public boolean throttled; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 下一个开始消费的存量数据的偏移，NULL表示达到当前表分片的结束位置
     */
    NEXT_CONSUME_OFFSET((short)1, "nextConsumeOffset"),
    /**
     * 消费的存量数据
     */
    RECORDS((short)2, "records"),
    /**
     * 表的主键属性
     */
    KEYS((short)3, "keys"),
    /**
     * 是否超过表的qps quota
     */
    THROTTLED((short)4, "throttled");

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
        case 1: // NEXT_CONSUME_OFFSET
          return NEXT_CONSUME_OFFSET;
        case 2: // RECORDS
          return RECORDS;
        case 3: // KEYS
          return KEYS;
        case 4: // THROTTLED
          return THROTTLED;
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
  private static final int __THROTTLED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NEXT_CONSUME_OFFSET,_Fields.RECORDS,_Fields.KEYS,_Fields.THROTTLED};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NEXT_CONSUME_OFFSET, new libthrift091.meta_data.FieldMetaData("nextConsumeOffset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.RECORDS, new libthrift091.meta_data.FieldMetaData("records", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP            , "Dictionary"))));
    tmpMap.put(_Fields.KEYS, new libthrift091.meta_data.FieldMetaData("keys", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    tmpMap.put(_Fields.THROTTLED, new libthrift091.meta_data.FieldMetaData("throttled", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DataConsumeResult.class, metaDataMap);
  }

  public DataConsumeResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataConsumeResult(DataConsumeResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNextConsumeOffset()) {
      this.nextConsumeOffset = other.nextConsumeOffset;
    }
    if (other.isSetRecords()) {
      List<Map<String,Datum>> __this__records = new ArrayList<Map<String,Datum>>(other.records.size());
      for (Map<String,Datum> other_element : other.records) {
        __this__records.add(other_element);
      }
      this.records = __this__records;
    }
    if (other.isSetKeys()) {
      List<String> __this__keys = new ArrayList<String>(other.keys);
      this.keys = __this__keys;
    }
    this.throttled = other.throttled;
  }

  public DataConsumeResult deepCopy() {
    return new DataConsumeResult(this);
  }

  @Override
  public void clear() {
    this.nextConsumeOffset = null;
    this.records = null;
    this.keys = null;
    setThrottledIsSet(false);
    this.throttled = false;
  }

  public int getNextConsumeOffsetSize() {
    return (this.nextConsumeOffset == null) ? 0 : this.nextConsumeOffset.size();
  }

  public void putToNextConsumeOffset(String key, Datum val) {
    if (this.nextConsumeOffset == null) {
      this.nextConsumeOffset = new HashMap<String,Datum>();
    }
    this.nextConsumeOffset.put(key, val);
  }

  /**
   * 下一个开始消费的存量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public Map<String,Datum> getNextConsumeOffset() {
    return this.nextConsumeOffset;
  }

  /**
   * 下一个开始消费的存量数据的偏移，NULL表示达到当前表分片的结束位置
   */
  public DataConsumeResult setNextConsumeOffset(Map<String,Datum> nextConsumeOffset) {
    this.nextConsumeOffset = nextConsumeOffset;
    return this;
  }

  public void unsetNextConsumeOffset() {
    this.nextConsumeOffset = null;
  }

  /** Returns true if field nextConsumeOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetNextConsumeOffset() {
    return this.nextConsumeOffset != null;
  }

  public void setNextConsumeOffsetIsSet(boolean value) {
    if (!value) {
      this.nextConsumeOffset = null;
    }
  }

  public int getRecordsSize() {
    return (this.records == null) ? 0 : this.records.size();
  }

  public java.util.Iterator<Map<String,Datum>> getRecordsIterator() {
    return (this.records == null) ? null : this.records.iterator();
  }

  public void addToRecords(Map<String,Datum> elem) {
    if (this.records == null) {
      this.records = new ArrayList<Map<String,Datum>>();
    }
    this.records.add(elem);
  }

  /**
   * 消费的存量数据
   */
  public List<Map<String,Datum>> getRecords() {
    return this.records;
  }

  /**
   * 消费的存量数据
   */
  public DataConsumeResult setRecords(List<Map<String,Datum>> records) {
    this.records = records;
    return this;
  }

  public void unsetRecords() {
    this.records = null;
  }

  /** Returns true if field records is set (has been assigned a value) and false otherwise */
  public boolean isSetRecords() {
    return this.records != null;
  }

  public void setRecordsIsSet(boolean value) {
    if (!value) {
      this.records = null;
    }
  }

  public int getKeysSize() {
    return (this.keys == null) ? 0 : this.keys.size();
  }

  public java.util.Iterator<String> getKeysIterator() {
    return (this.keys == null) ? null : this.keys.iterator();
  }

  public void addToKeys(String elem) {
    if (this.keys == null) {
      this.keys = new ArrayList<String>();
    }
    this.keys.add(elem);
  }

  /**
   * 表的主键属性
   */
  public List<String> getKeys() {
    return this.keys;
  }

  /**
   * 表的主键属性
   */
  public DataConsumeResult setKeys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  /** Returns true if field keys is set (has been assigned a value) and false otherwise */
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
    }
  }

  /**
   * 是否超过表的qps quota
   */
  public boolean isThrottled() {
    return this.throttled;
  }

  /**
   * 是否超过表的qps quota
   */
  public DataConsumeResult setThrottled(boolean throttled) {
    this.throttled = throttled;
    setThrottledIsSet(true);
    return this;
  }

  public void unsetThrottled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THROTTLED_ISSET_ID);
  }

  /** Returns true if field throttled is set (has been assigned a value) and false otherwise */
  public boolean isSetThrottled() {
    return EncodingUtils.testBit(__isset_bitfield, __THROTTLED_ISSET_ID);
  }

  public void setThrottledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THROTTLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NEXT_CONSUME_OFFSET:
      if (value == null) {
        unsetNextConsumeOffset();
      } else {
        setNextConsumeOffset((Map<String,Datum>)value);
      }
      break;

    case RECORDS:
      if (value == null) {
        unsetRecords();
      } else {
        setRecords((List<Map<String,Datum>>)value);
      }
      break;

    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((List<String>)value);
      }
      break;

    case THROTTLED:
      if (value == null) {
        unsetThrottled();
      } else {
        setThrottled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NEXT_CONSUME_OFFSET:
      return getNextConsumeOffset();

    case RECORDS:
      return getRecords();

    case KEYS:
      return getKeys();

    case THROTTLED:
      return Boolean.valueOf(isThrottled());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NEXT_CONSUME_OFFSET:
      return isSetNextConsumeOffset();
    case RECORDS:
      return isSetRecords();
    case KEYS:
      return isSetKeys();
    case THROTTLED:
      return isSetThrottled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DataConsumeResult)
      return this.equals((DataConsumeResult)that);
    return false;
  }

  public boolean equals(DataConsumeResult that) {
    if (that == null)
      return false;

    boolean this_present_nextConsumeOffset = true && this.isSetNextConsumeOffset();
    boolean that_present_nextConsumeOffset = true && that.isSetNextConsumeOffset();
    if (this_present_nextConsumeOffset || that_present_nextConsumeOffset) {
      if (!(this_present_nextConsumeOffset && that_present_nextConsumeOffset))
        return false;
      if (!this.nextConsumeOffset.equals(that.nextConsumeOffset))
        return false;
    }

    boolean this_present_records = true && this.isSetRecords();
    boolean that_present_records = true && that.isSetRecords();
    if (this_present_records || that_present_records) {
      if (!(this_present_records && that_present_records))
        return false;
      if (!this.records.equals(that.records))
        return false;
    }

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!this.keys.equals(that.keys))
        return false;
    }

    boolean this_present_throttled = true && this.isSetThrottled();
    boolean that_present_throttled = true && that.isSetThrottled();
    if (this_present_throttled || that_present_throttled) {
      if (!(this_present_throttled && that_present_throttled))
        return false;
      if (this.throttled != that.throttled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nextConsumeOffset = true && (isSetNextConsumeOffset());
    list.add(present_nextConsumeOffset);
    if (present_nextConsumeOffset)
      list.add(nextConsumeOffset);

    boolean present_records = true && (isSetRecords());
    list.add(present_records);
    if (present_records)
      list.add(records);

    boolean present_keys = true && (isSetKeys());
    list.add(present_keys);
    if (present_keys)
      list.add(keys);

    boolean present_throttled = true && (isSetThrottled());
    list.add(present_throttled);
    if (present_throttled)
      list.add(throttled);

    return list.hashCode();
  }

  @Override
  public int compareTo(DataConsumeResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNextConsumeOffset()).compareTo(other.isSetNextConsumeOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextConsumeOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.nextConsumeOffset, other.nextConsumeOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecords()).compareTo(other.isSetRecords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecords()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.records, other.records);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(other.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeys()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.keys, other.keys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThrottled()).compareTo(other.isSetThrottled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThrottled()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.throttled, other.throttled);
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
    StringBuilder sb = new StringBuilder("DataConsumeResult(");
    boolean first = true;

    if (isSetNextConsumeOffset()) {
      sb.append("nextConsumeOffset:");
      if (this.nextConsumeOffset == null) {
        sb.append("null");
      } else {
        sb.append(this.nextConsumeOffset);
      }
      first = false;
    }
    if (isSetRecords()) {
      if (!first) sb.append(", ");
      sb.append("records:");
      if (this.records == null) {
        sb.append("null");
      } else {
        sb.append(this.records);
      }
      first = false;
    }
    if (isSetKeys()) {
      if (!first) sb.append(", ");
      sb.append("keys:");
      if (this.keys == null) {
        sb.append("null");
      } else {
        sb.append(this.keys);
      }
      first = false;
    }
    if (isSetThrottled()) {
      if (!first) sb.append(", ");
      sb.append("throttled:");
      sb.append(this.throttled);
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

  private static class DataConsumeResultStandardSchemeFactory implements SchemeFactory {
    public DataConsumeResultStandardScheme getScheme() {
      return new DataConsumeResultStandardScheme();
    }
  }

  private static class DataConsumeResultStandardScheme extends StandardScheme<DataConsumeResult> {

    public void read(libthrift091.protocol.TProtocol iprot, DataConsumeResult struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NEXT_CONSUME_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map352 = iprot.readMapBegin();
                struct.nextConsumeOffset = new HashMap<String,Datum>(2*_map352.size);
                String _key353;
                Datum _val354;
                for (int _i355 = 0; _i355 < _map352.size; ++_i355)
                {
                  _key353 = iprot.readString();
                  _val354 = new Datum();
                  _val354.read(iprot);
                  struct.nextConsumeOffset.put(_key353, _val354);
                }
                iprot.readMapEnd();
              }
              struct.setNextConsumeOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECORDS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list356 = iprot.readListBegin();
                struct.records = new ArrayList<Map<String,Datum>>(_list356.size);
                Map<String,Datum> _elem357;
                for (int _i358 = 0; _i358 < _list356.size; ++_i358)
                {
                  {
                    libthrift091.protocol.TMap _map359 = iprot.readMapBegin();
                    _elem357 = new HashMap<String,Datum>(2*_map359.size);
                    String _key360;
                    Datum _val361;
                    for (int _i362 = 0; _i362 < _map359.size; ++_i362)
                    {
                      _key360 = iprot.readString();
                      _val361 = new Datum();
                      _val361.read(iprot);
                      _elem357.put(_key360, _val361);
                    }
                    iprot.readMapEnd();
                  }
                  struct.records.add(_elem357);
                }
                iprot.readListEnd();
              }
              struct.setRecordsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // KEYS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list363 = iprot.readListBegin();
                struct.keys = new ArrayList<String>(_list363.size);
                String _elem364;
                for (int _i365 = 0; _i365 < _list363.size; ++_i365)
                {
                  _elem364 = iprot.readString();
                  struct.keys.add(_elem364);
                }
                iprot.readListEnd();
              }
              struct.setKeysIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // THROTTLED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.throttled = iprot.readBool();
              struct.setThrottledIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, DataConsumeResult struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nextConsumeOffset != null) {
        if (struct.isSetNextConsumeOffset()) {
          oprot.writeFieldBegin(NEXT_CONSUME_OFFSET_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.nextConsumeOffset.size()));
            for (Map.Entry<String, Datum> _iter366 : struct.nextConsumeOffset.entrySet())
            {
              oprot.writeString(_iter366.getKey());
              _iter366.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.records != null) {
        if (struct.isSetRecords()) {
          oprot.writeFieldBegin(RECORDS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.MAP, struct.records.size()));
            for (Map<String,Datum> _iter367 : struct.records)
            {
              {
                oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, _iter367.size()));
                for (Map.Entry<String, Datum> _iter368 : _iter367.entrySet())
                {
                  oprot.writeString(_iter368.getKey());
                  _iter368.getValue().write(oprot);
                }
                oprot.writeMapEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.keys != null) {
        if (struct.isSetKeys()) {
          oprot.writeFieldBegin(KEYS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.keys.size()));
            for (String _iter369 : struct.keys)
            {
              oprot.writeString(_iter369);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetThrottled()) {
        oprot.writeFieldBegin(THROTTLED_FIELD_DESC);
        oprot.writeBool(struct.throttled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataConsumeResultTupleSchemeFactory implements SchemeFactory {
    public DataConsumeResultTupleScheme getScheme() {
      return new DataConsumeResultTupleScheme();
    }
  }

  private static class DataConsumeResultTupleScheme extends TupleScheme<DataConsumeResult> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DataConsumeResult struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNextConsumeOffset()) {
        optionals.set(0);
      }
      if (struct.isSetRecords()) {
        optionals.set(1);
      }
      if (struct.isSetKeys()) {
        optionals.set(2);
      }
      if (struct.isSetThrottled()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetNextConsumeOffset()) {
        {
          oprot.writeI32(struct.nextConsumeOffset.size());
          for (Map.Entry<String, Datum> _iter370 : struct.nextConsumeOffset.entrySet())
          {
            oprot.writeString(_iter370.getKey());
            _iter370.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetRecords()) {
        {
          oprot.writeI32(struct.records.size());
          for (Map<String,Datum> _iter371 : struct.records)
          {
            {
              oprot.writeI32(_iter371.size());
              for (Map.Entry<String, Datum> _iter372 : _iter371.entrySet())
              {
                oprot.writeString(_iter372.getKey());
                _iter372.getValue().write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetKeys()) {
        {
          oprot.writeI32(struct.keys.size());
          for (String _iter373 : struct.keys)
          {
            oprot.writeString(_iter373);
          }
        }
      }
      if (struct.isSetThrottled()) {
        oprot.writeBool(struct.throttled);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DataConsumeResult struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map374 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.nextConsumeOffset = new HashMap<String,Datum>(2*_map374.size);
          String _key375;
          Datum _val376;
          for (int _i377 = 0; _i377 < _map374.size; ++_i377)
          {
            _key375 = iprot.readString();
            _val376 = new Datum();
            _val376.read(iprot);
            struct.nextConsumeOffset.put(_key375, _val376);
          }
        }
        struct.setNextConsumeOffsetIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list378 = new libthrift091.protocol.TList(libthrift091.protocol.TType.MAP, iprot.readI32());
          struct.records = new ArrayList<Map<String,Datum>>(_list378.size);
          Map<String,Datum> _elem379;
          for (int _i380 = 0; _i380 < _list378.size; ++_i380)
          {
            {
              libthrift091.protocol.TMap _map381 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
              _elem379 = new HashMap<String,Datum>(2*_map381.size);
              String _key382;
              Datum _val383;
              for (int _i384 = 0; _i384 < _map381.size; ++_i384)
              {
                _key382 = iprot.readString();
                _val383 = new Datum();
                _val383.read(iprot);
                _elem379.put(_key382, _val383);
              }
            }
            struct.records.add(_elem379);
          }
        }
        struct.setRecordsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TList _list385 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.keys = new ArrayList<String>(_list385.size);
          String _elem386;
          for (int _i387 = 0; _i387 < _list385.size; ++_i387)
          {
            _elem386 = iprot.readString();
            struct.keys.add(_elem386);
          }
        }
        struct.setKeysIsSet(true);
      }
      if (incoming.get(3)) {
        struct.throttled = iprot.readBool();
        struct.setThrottledIsSet(true);
      }
    }
  }

}

