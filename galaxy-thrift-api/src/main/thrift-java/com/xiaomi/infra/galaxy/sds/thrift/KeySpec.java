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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-5-14")
public class KeySpec implements libthrift091.TBase<KeySpec, KeySpec._Fields>, java.io.Serializable, Cloneable, Comparable<KeySpec> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("KeySpec");

  private static final libthrift091.protocol.TField ATTRIBUTE_FIELD_DESC = new libthrift091.protocol.TField("attribute", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField ASC_FIELD_DESC = new libthrift091.protocol.TField("asc", libthrift091.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new KeySpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new KeySpecTupleSchemeFactory());
  }

  public String attribute; // optional
  public boolean asc; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    ATTRIBUTE((short)1, "attribute"),
    ASC((short)2, "asc");

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
        case 1: // ATTRIBUTE
          return ATTRIBUTE;
        case 2: // ASC
          return ASC;
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
  private static final int __ASC_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ATTRIBUTE,_Fields.ASC};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ATTRIBUTE, new libthrift091.meta_data.FieldMetaData("attribute", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ASC, new libthrift091.meta_data.FieldMetaData("asc", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(KeySpec.class, metaDataMap);
  }

  public KeySpec() {
    this.asc = true;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeySpec(KeySpec other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAttribute()) {
      this.attribute = other.attribute;
    }
    this.asc = other.asc;
  }

  public KeySpec deepCopy() {
    return new KeySpec(this);
  }

  @Override
  public void clear() {
    this.attribute = null;
    this.asc = true;

  }

  public String getAttribute() {
    return this.attribute;
  }

  public KeySpec setAttribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  public void unsetAttribute() {
    this.attribute = null;
  }

  /** Returns true if field attribute is set (has been assigned a value) and false otherwise */
  public boolean isSetAttribute() {
    return this.attribute != null;
  }

  public void setAttributeIsSet(boolean value) {
    if (!value) {
      this.attribute = null;
    }
  }

  public boolean isAsc() {
    return this.asc;
  }

  public KeySpec setAsc(boolean asc) {
    this.asc = asc;
    setAscIsSet(true);
    return this;
  }

  public void unsetAsc() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ASC_ISSET_ID);
  }

  /** Returns true if field asc is set (has been assigned a value) and false otherwise */
  public boolean isSetAsc() {
    return EncodingUtils.testBit(__isset_bitfield, __ASC_ISSET_ID);
  }

  public void setAscIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ASC_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ATTRIBUTE:
      if (value == null) {
        unsetAttribute();
      } else {
        setAttribute((String)value);
      }
      break;

    case ASC:
      if (value == null) {
        unsetAsc();
      } else {
        setAsc((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ATTRIBUTE:
      return getAttribute();

    case ASC:
      return Boolean.valueOf(isAsc());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ATTRIBUTE:
      return isSetAttribute();
    case ASC:
      return isSetAsc();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof KeySpec)
      return this.equals((KeySpec)that);
    return false;
  }

  public boolean equals(KeySpec that) {
    if (that == null)
      return false;

    boolean this_present_attribute = true && this.isSetAttribute();
    boolean that_present_attribute = true && that.isSetAttribute();
    if (this_present_attribute || that_present_attribute) {
      if (!(this_present_attribute && that_present_attribute))
        return false;
      if (!this.attribute.equals(that.attribute))
        return false;
    }

    boolean this_present_asc = true && this.isSetAsc();
    boolean that_present_asc = true && that.isSetAsc();
    if (this_present_asc || that_present_asc) {
      if (!(this_present_asc && that_present_asc))
        return false;
      if (this.asc != that.asc)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_attribute = true && (isSetAttribute());
    list.add(present_attribute);
    if (present_attribute)
      list.add(attribute);

    boolean present_asc = true && (isSetAsc());
    list.add(present_asc);
    if (present_asc)
      list.add(asc);

    return list.hashCode();
  }

  @Override
  public int compareTo(KeySpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAttribute()).compareTo(other.isSetAttribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttribute()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attribute, other.attribute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAsc()).compareTo(other.isSetAsc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAsc()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.asc, other.asc);
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
    StringBuilder sb = new StringBuilder("KeySpec(");
    boolean first = true;

    if (isSetAttribute()) {
      sb.append("attribute:");
      if (this.attribute == null) {
        sb.append("null");
      } else {
        sb.append(this.attribute);
      }
      first = false;
    }
    if (isSetAsc()) {
      if (!first) sb.append(", ");
      sb.append("asc:");
      sb.append(this.asc);
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

  private static class KeySpecStandardSchemeFactory implements SchemeFactory {
    public KeySpecStandardScheme getScheme() {
      return new KeySpecStandardScheme();
    }
  }

  private static class KeySpecStandardScheme extends StandardScheme<KeySpec> {

    public void read(libthrift091.protocol.TProtocol iprot, KeySpec struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ATTRIBUTE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.attribute = iprot.readString();
              struct.setAttributeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ASC
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.asc = iprot.readBool();
              struct.setAscIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, KeySpec struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.attribute != null) {
        if (struct.isSetAttribute()) {
          oprot.writeFieldBegin(ATTRIBUTE_FIELD_DESC);
          oprot.writeString(struct.attribute);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetAsc()) {
        oprot.writeFieldBegin(ASC_FIELD_DESC);
        oprot.writeBool(struct.asc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeySpecTupleSchemeFactory implements SchemeFactory {
    public KeySpecTupleScheme getScheme() {
      return new KeySpecTupleScheme();
    }
  }

  private static class KeySpecTupleScheme extends TupleScheme<KeySpec> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, KeySpec struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAttribute()) {
        optionals.set(0);
      }
      if (struct.isSetAsc()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAttribute()) {
        oprot.writeString(struct.attribute);
      }
      if (struct.isSetAsc()) {
        oprot.writeBool(struct.asc);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, KeySpec struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.attribute = iprot.readString();
        struct.setAttributeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.asc = iprot.readBool();
        struct.setAscIsSet(true);
      }
    }
  }

}

