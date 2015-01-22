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
 * RC_BASIC的列组定义
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-1-20")
public class ValueList implements libthrift091.TBase<ValueList, ValueList._Fields>, java.io.Serializable, Cloneable, Comparable<ValueList> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ValueList");

  private static final libthrift091.protocol.TField VALUES_FIELD_DESC = new libthrift091.protocol.TField("values", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ValueListStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ValueListTupleSchemeFactory());
  }

  /**
   * 列组数据，仅当所有行对应的列无数据时才为空，而只有部分行对应的列无数据时，其对应值为NullValue
   */
  public List<com.xiaomi.infra.galaxy.sds.thrift.Value> values; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 列组数据，仅当所有行对应的列无数据时才为空，而只有部分行对应的列无数据时，其对应值为NullValue
     */
    VALUES((short)1, "values");

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
        case 1: // VALUES
          return VALUES;
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
  private static final _Fields optionals[] = {_Fields.VALUES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUES, new libthrift091.meta_data.FieldMetaData("values", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.sds.thrift.Value.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ValueList.class, metaDataMap);
  }

  public ValueList() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ValueList(ValueList other) {
    if (other.isSetValues()) {
      List<com.xiaomi.infra.galaxy.sds.thrift.Value> __this__values = new ArrayList<com.xiaomi.infra.galaxy.sds.thrift.Value>(other.values.size());
      for (com.xiaomi.infra.galaxy.sds.thrift.Value other_element : other.values) {
        __this__values.add(new com.xiaomi.infra.galaxy.sds.thrift.Value(other_element));
      }
      this.values = __this__values;
    }
  }

  public ValueList deepCopy() {
    return new ValueList(this);
  }

  @Override
  public void clear() {
    this.values = null;
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public java.util.Iterator<com.xiaomi.infra.galaxy.sds.thrift.Value> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(com.xiaomi.infra.galaxy.sds.thrift.Value elem) {
    if (this.values == null) {
      this.values = new ArrayList<com.xiaomi.infra.galaxy.sds.thrift.Value>();
    }
    this.values.add(elem);
  }

  /**
   * 列组数据，仅当所有行对应的列无数据时才为空，而只有部分行对应的列无数据时，其对应值为NullValue
   */
  public List<com.xiaomi.infra.galaxy.sds.thrift.Value> getValues() {
    return this.values;
  }

  /**
   * 列组数据，仅当所有行对应的列无数据时才为空，而只有部分行对应的列无数据时，其对应值为NullValue
   */
  public ValueList setValues(List<com.xiaomi.infra.galaxy.sds.thrift.Value> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<com.xiaomi.infra.galaxy.sds.thrift.Value>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUES:
      return getValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VALUES:
      return isSetValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ValueList)
      return this.equals((ValueList)that);
    return false;
  }

  public boolean equals(ValueList that) {
    if (that == null)
      return false;

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_values = true && (isSetValues());
    list.add(present_values);
    if (present_values)
      list.add(values);

    return list.hashCode();
  }

  @Override
  public int compareTo(ValueList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.values, other.values);
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
    StringBuilder sb = new StringBuilder("ValueList(");
    boolean first = true;

    if (isSetValues()) {
      sb.append("values:");
      if (this.values == null) {
        sb.append("null");
      } else {
        sb.append(this.values);
      }
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ValueListStandardSchemeFactory implements SchemeFactory {
    public ValueListStandardScheme getScheme() {
      return new ValueListStandardScheme();
    }
  }

  private static class ValueListStandardScheme extends StandardScheme<ValueList> {

    public void read(libthrift091.protocol.TProtocol iprot, ValueList struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list56 = iprot.readListBegin();
                struct.values = new ArrayList<com.xiaomi.infra.galaxy.sds.thrift.Value>(_list56.size);
                com.xiaomi.infra.galaxy.sds.thrift.Value _elem57;
                for (int _i58 = 0; _i58 < _list56.size; ++_i58)
                {
                  _elem57 = new com.xiaomi.infra.galaxy.sds.thrift.Value();
                  _elem57.read(iprot);
                  struct.values.add(_elem57);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ValueList struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.values != null) {
        if (struct.isSetValues()) {
          oprot.writeFieldBegin(VALUES_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.values.size()));
            for (com.xiaomi.infra.galaxy.sds.thrift.Value _iter59 : struct.values)
            {
              _iter59.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ValueListTupleSchemeFactory implements SchemeFactory {
    public ValueListTupleScheme getScheme() {
      return new ValueListTupleScheme();
    }
  }

  private static class ValueListTupleScheme extends TupleScheme<ValueList> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ValueList struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetValues()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (com.xiaomi.infra.galaxy.sds.thrift.Value _iter60 : struct.values)
          {
            _iter60.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ValueList struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list61 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.values = new ArrayList<com.xiaomi.infra.galaxy.sds.thrift.Value>(_list61.size);
          com.xiaomi.infra.galaxy.sds.thrift.Value _elem62;
          for (int _i63 = 0; _i63 < _list61.size; ++_i63)
          {
            _elem62 = new com.xiaomi.infra.galaxy.sds.thrift.Value();
            _elem62.read(iprot);
            struct.values.add(_elem62);
          }
        }
        struct.setValuesIsSet(true);
      }
    }
  }

}

