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
 * 局部二级索引定义
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-9")
public class LocalSecondaryIndexSpec implements libthrift091.TBase<LocalSecondaryIndexSpec, LocalSecondaryIndexSpec._Fields>, java.io.Serializable, Cloneable, Comparable<LocalSecondaryIndexSpec> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("LocalSecondaryIndexSpec");

  private static final libthrift091.protocol.TField INDEX_SCHEMA_FIELD_DESC = new libthrift091.protocol.TField("indexSchema", libthrift091.protocol.TType.LIST, (short)1);
  private static final libthrift091.protocol.TField PROJECTIONS_FIELD_DESC = new libthrift091.protocol.TField("projections", libthrift091.protocol.TType.LIST, (short)2);
  private static final libthrift091.protocol.TField CONSISTENCY_MODE_FIELD_DESC = new libthrift091.protocol.TField("consistencyMode", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField UNIQUE_FIELD_DESC = new libthrift091.protocol.TField("unique", libthrift091.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LocalSecondaryIndexSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LocalSecondaryIndexSpecTupleSchemeFactory());
  }

  /**
   * 索引定义
   */
  public List<KeySpec> indexSchema; // optional
  /**
   * 映射的属性，仅当索引类型为Eager时才可设置
   */
  public List<String> projections; // optional
  /**
   * 索引数据一致性模式
   * 
   * @see SecondaryIndexConsistencyMode
   */
  public SecondaryIndexConsistencyMode consistencyMode; // optional
  /**
   * 是否为唯一索引
   */
  public boolean unique; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 索引定义
     */
    INDEX_SCHEMA((short)1, "indexSchema"),
    /**
     * 映射的属性，仅当索引类型为Eager时才可设置
     */
    PROJECTIONS((short)2, "projections"),
    /**
     * 索引数据一致性模式
     * 
     * @see SecondaryIndexConsistencyMode
     */
    CONSISTENCY_MODE((short)3, "consistencyMode"),
    /**
     * 是否为唯一索引
     */
    UNIQUE((short)4, "unique");

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
        case 1: // INDEX_SCHEMA
          return INDEX_SCHEMA;
        case 2: // PROJECTIONS
          return PROJECTIONS;
        case 3: // CONSISTENCY_MODE
          return CONSISTENCY_MODE;
        case 4: // UNIQUE
          return UNIQUE;
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
  private static final int __UNIQUE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INDEX_SCHEMA,_Fields.PROJECTIONS,_Fields.CONSISTENCY_MODE,_Fields.UNIQUE};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INDEX_SCHEMA, new libthrift091.meta_data.FieldMetaData("indexSchema", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.LIST        , "IndexSpec")));
    tmpMap.put(_Fields.PROJECTIONS, new libthrift091.meta_data.FieldMetaData("projections", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.LIST        , "Attributes")));
    tmpMap.put(_Fields.CONSISTENCY_MODE, new libthrift091.meta_data.FieldMetaData("consistencyMode", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, SecondaryIndexConsistencyMode.class)));
    tmpMap.put(_Fields.UNIQUE, new libthrift091.meta_data.FieldMetaData("unique", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(LocalSecondaryIndexSpec.class, metaDataMap);
  }

  public LocalSecondaryIndexSpec() {
    this.consistencyMode = com.xiaomi.infra.galaxy.sds.thrift.SecondaryIndexConsistencyMode.LAZY;

    this.unique = false;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LocalSecondaryIndexSpec(LocalSecondaryIndexSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetIndexSchema()) {
      this.indexSchema = other.indexSchema;
    }
    if (other.isSetProjections()) {
      this.projections = other.projections;
    }
    if (other.isSetConsistencyMode()) {
      this.consistencyMode = other.consistencyMode;
    }
    this.unique = other.unique;
  }

  public LocalSecondaryIndexSpec deepCopy() {
    return new LocalSecondaryIndexSpec(this);
  }

  @Override
  public void clear() {
    this.indexSchema = null;
    this.projections = null;
    this.consistencyMode = com.xiaomi.infra.galaxy.sds.thrift.SecondaryIndexConsistencyMode.LAZY;

    this.unique = false;

  }

  public int getIndexSchemaSize() {
    return (this.indexSchema == null) ? 0 : this.indexSchema.size();
  }

  public java.util.Iterator<KeySpec> getIndexSchemaIterator() {
    return (this.indexSchema == null) ? null : this.indexSchema.iterator();
  }

  public void addToIndexSchema(KeySpec elem) {
    if (this.indexSchema == null) {
      this.indexSchema = new ArrayList<KeySpec>();
    }
    this.indexSchema.add(elem);
  }

  /**
   * 索引定义
   */
  public List<KeySpec> getIndexSchema() {
    return this.indexSchema;
  }

  /**
   * 索引定义
   */
  public LocalSecondaryIndexSpec setIndexSchema(List<KeySpec> indexSchema) {
    this.indexSchema = indexSchema;
    return this;
  }

  public void unsetIndexSchema() {
    this.indexSchema = null;
  }

  /** Returns true if field indexSchema is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexSchema() {
    return this.indexSchema != null;
  }

  public void setIndexSchemaIsSet(boolean value) {
    if (!value) {
      this.indexSchema = null;
    }
  }

  public int getProjectionsSize() {
    return (this.projections == null) ? 0 : this.projections.size();
  }

  public java.util.Iterator<String> getProjectionsIterator() {
    return (this.projections == null) ? null : this.projections.iterator();
  }

  public void addToProjections(String elem) {
    if (this.projections == null) {
      this.projections = new ArrayList<String>();
    }
    this.projections.add(elem);
  }

  /**
   * 映射的属性，仅当索引类型为Eager时才可设置
   */
  public List<String> getProjections() {
    return this.projections;
  }

  /**
   * 映射的属性，仅当索引类型为Eager时才可设置
   */
  public LocalSecondaryIndexSpec setProjections(List<String> projections) {
    this.projections = projections;
    return this;
  }

  public void unsetProjections() {
    this.projections = null;
  }

  /** Returns true if field projections is set (has been assigned a value) and false otherwise */
  public boolean isSetProjections() {
    return this.projections != null;
  }

  public void setProjectionsIsSet(boolean value) {
    if (!value) {
      this.projections = null;
    }
  }

  /**
   * 索引数据一致性模式
   * 
   * @see SecondaryIndexConsistencyMode
   */
  public SecondaryIndexConsistencyMode getConsistencyMode() {
    return this.consistencyMode;
  }

  /**
   * 索引数据一致性模式
   * 
   * @see SecondaryIndexConsistencyMode
   */
  public LocalSecondaryIndexSpec setConsistencyMode(SecondaryIndexConsistencyMode consistencyMode) {
    this.consistencyMode = consistencyMode;
    return this;
  }

  public void unsetConsistencyMode() {
    this.consistencyMode = null;
  }

  /** Returns true if field consistencyMode is set (has been assigned a value) and false otherwise */
  public boolean isSetConsistencyMode() {
    return this.consistencyMode != null;
  }

  public void setConsistencyModeIsSet(boolean value) {
    if (!value) {
      this.consistencyMode = null;
    }
  }

  /**
   * 是否为唯一索引
   */
  public boolean isUnique() {
    return this.unique;
  }

  /**
   * 是否为唯一索引
   */
  public LocalSecondaryIndexSpec setUnique(boolean unique) {
    this.unique = unique;
    setUniqueIsSet(true);
    return this;
  }

  public void unsetUnique() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNIQUE_ISSET_ID);
  }

  /** Returns true if field unique is set (has been assigned a value) and false otherwise */
  public boolean isSetUnique() {
    return EncodingUtils.testBit(__isset_bitfield, __UNIQUE_ISSET_ID);
  }

  public void setUniqueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNIQUE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INDEX_SCHEMA:
      if (value == null) {
        unsetIndexSchema();
      } else {
        setIndexSchema((List<KeySpec>)value);
      }
      break;

    case PROJECTIONS:
      if (value == null) {
        unsetProjections();
      } else {
        setProjections((List<String>)value);
      }
      break;

    case CONSISTENCY_MODE:
      if (value == null) {
        unsetConsistencyMode();
      } else {
        setConsistencyMode((SecondaryIndexConsistencyMode)value);
      }
      break;

    case UNIQUE:
      if (value == null) {
        unsetUnique();
      } else {
        setUnique((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INDEX_SCHEMA:
      return getIndexSchema();

    case PROJECTIONS:
      return getProjections();

    case CONSISTENCY_MODE:
      return getConsistencyMode();

    case UNIQUE:
      return Boolean.valueOf(isUnique());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INDEX_SCHEMA:
      return isSetIndexSchema();
    case PROJECTIONS:
      return isSetProjections();
    case CONSISTENCY_MODE:
      return isSetConsistencyMode();
    case UNIQUE:
      return isSetUnique();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LocalSecondaryIndexSpec)
      return this.equals((LocalSecondaryIndexSpec)that);
    return false;
  }

  public boolean equals(LocalSecondaryIndexSpec that) {
    if (that == null)
      return false;

    boolean this_present_indexSchema = true && this.isSetIndexSchema();
    boolean that_present_indexSchema = true && that.isSetIndexSchema();
    if (this_present_indexSchema || that_present_indexSchema) {
      if (!(this_present_indexSchema && that_present_indexSchema))
        return false;
      if (!this.indexSchema.equals(that.indexSchema))
        return false;
    }

    boolean this_present_projections = true && this.isSetProjections();
    boolean that_present_projections = true && that.isSetProjections();
    if (this_present_projections || that_present_projections) {
      if (!(this_present_projections && that_present_projections))
        return false;
      if (!this.projections.equals(that.projections))
        return false;
    }

    boolean this_present_consistencyMode = true && this.isSetConsistencyMode();
    boolean that_present_consistencyMode = true && that.isSetConsistencyMode();
    if (this_present_consistencyMode || that_present_consistencyMode) {
      if (!(this_present_consistencyMode && that_present_consistencyMode))
        return false;
      if (!this.consistencyMode.equals(that.consistencyMode))
        return false;
    }

    boolean this_present_unique = true && this.isSetUnique();
    boolean that_present_unique = true && that.isSetUnique();
    if (this_present_unique || that_present_unique) {
      if (!(this_present_unique && that_present_unique))
        return false;
      if (this.unique != that.unique)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_indexSchema = true && (isSetIndexSchema());
    list.add(present_indexSchema);
    if (present_indexSchema)
      list.add(indexSchema);

    boolean present_projections = true && (isSetProjections());
    list.add(present_projections);
    if (present_projections)
      list.add(projections);

    boolean present_consistencyMode = true && (isSetConsistencyMode());
    list.add(present_consistencyMode);
    if (present_consistencyMode)
      list.add(consistencyMode.getValue());

    boolean present_unique = true && (isSetUnique());
    list.add(present_unique);
    if (present_unique)
      list.add(unique);

    return list.hashCode();
  }

  @Override
  public int compareTo(LocalSecondaryIndexSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIndexSchema()).compareTo(other.isSetIndexSchema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexSchema()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.indexSchema, other.indexSchema);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProjections()).compareTo(other.isSetProjections());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProjections()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.projections, other.projections);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConsistencyMode()).compareTo(other.isSetConsistencyMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConsistencyMode()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.consistencyMode, other.consistencyMode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnique()).compareTo(other.isSetUnique());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnique()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.unique, other.unique);
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
    StringBuilder sb = new StringBuilder("LocalSecondaryIndexSpec(");
    boolean first = true;

    if (isSetIndexSchema()) {
      sb.append("indexSchema:");
      if (this.indexSchema == null) {
        sb.append("null");
      } else {
        sb.append(this.indexSchema);
      }
      first = false;
    }
    if (isSetProjections()) {
      if (!first) sb.append(", ");
      sb.append("projections:");
      if (this.projections == null) {
        sb.append("null");
      } else {
        sb.append(this.projections);
      }
      first = false;
    }
    if (isSetConsistencyMode()) {
      if (!first) sb.append(", ");
      sb.append("consistencyMode:");
      if (this.consistencyMode == null) {
        sb.append("null");
      } else {
        sb.append(this.consistencyMode);
      }
      first = false;
    }
    if (isSetUnique()) {
      if (!first) sb.append(", ");
      sb.append("unique:");
      sb.append(this.unique);
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

  private static class LocalSecondaryIndexSpecStandardSchemeFactory implements SchemeFactory {
    public LocalSecondaryIndexSpecStandardScheme getScheme() {
      return new LocalSecondaryIndexSpecStandardScheme();
    }
  }

  private static class LocalSecondaryIndexSpecStandardScheme extends StandardScheme<LocalSecondaryIndexSpec> {

    public void read(libthrift091.protocol.TProtocol iprot, LocalSecondaryIndexSpec struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INDEX_SCHEMA
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list64 = iprot.readListBegin();
                struct.indexSchema = new ArrayList<KeySpec>(_list64.size);
                KeySpec _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = new KeySpec();
                  _elem65.read(iprot);
                  struct.indexSchema.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setIndexSchemaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROJECTIONS
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list67 = iprot.readListBegin();
                struct.projections = new ArrayList<String>(_list67.size);
                String _elem68;
                for (int _i69 = 0; _i69 < _list67.size; ++_i69)
                {
                  _elem68 = iprot.readString();
                  struct.projections.add(_elem68);
                }
                iprot.readListEnd();
              }
              struct.setProjectionsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONSISTENCY_MODE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.consistencyMode = com.xiaomi.infra.galaxy.sds.thrift.SecondaryIndexConsistencyMode.findByValue(iprot.readI32());
              struct.setConsistencyModeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UNIQUE
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.unique = iprot.readBool();
              struct.setUniqueIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, LocalSecondaryIndexSpec struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.indexSchema != null) {
        if (struct.isSetIndexSchema()) {
          oprot.writeFieldBegin(INDEX_SCHEMA_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.indexSchema.size()));
            for (KeySpec _iter70 : struct.indexSchema)
            {
              _iter70.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.projections != null) {
        if (struct.isSetProjections()) {
          oprot.writeFieldBegin(PROJECTIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.projections.size()));
            for (String _iter71 : struct.projections)
            {
              oprot.writeString(_iter71);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.consistencyMode != null) {
        if (struct.isSetConsistencyMode()) {
          oprot.writeFieldBegin(CONSISTENCY_MODE_FIELD_DESC);
          oprot.writeI32(struct.consistencyMode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetUnique()) {
        oprot.writeFieldBegin(UNIQUE_FIELD_DESC);
        oprot.writeBool(struct.unique);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocalSecondaryIndexSpecTupleSchemeFactory implements SchemeFactory {
    public LocalSecondaryIndexSpecTupleScheme getScheme() {
      return new LocalSecondaryIndexSpecTupleScheme();
    }
  }

  private static class LocalSecondaryIndexSpecTupleScheme extends TupleScheme<LocalSecondaryIndexSpec> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, LocalSecondaryIndexSpec struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIndexSchema()) {
        optionals.set(0);
      }
      if (struct.isSetProjections()) {
        optionals.set(1);
      }
      if (struct.isSetConsistencyMode()) {
        optionals.set(2);
      }
      if (struct.isSetUnique()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIndexSchema()) {
        {
          oprot.writeI32(struct.indexSchema.size());
          for (KeySpec _iter72 : struct.indexSchema)
          {
            _iter72.write(oprot);
          }
        }
      }
      if (struct.isSetProjections()) {
        {
          oprot.writeI32(struct.projections.size());
          for (String _iter73 : struct.projections)
          {
            oprot.writeString(_iter73);
          }
        }
      }
      if (struct.isSetConsistencyMode()) {
        oprot.writeI32(struct.consistencyMode.getValue());
      }
      if (struct.isSetUnique()) {
        oprot.writeBool(struct.unique);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, LocalSecondaryIndexSpec struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list74 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.indexSchema = new ArrayList<KeySpec>(_list74.size);
          KeySpec _elem75;
          for (int _i76 = 0; _i76 < _list74.size; ++_i76)
          {
            _elem75 = new KeySpec();
            _elem75.read(iprot);
            struct.indexSchema.add(_elem75);
          }
        }
        struct.setIndexSchemaIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list77 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.projections = new ArrayList<String>(_list77.size);
          String _elem78;
          for (int _i79 = 0; _i79 < _list77.size; ++_i79)
          {
            _elem78 = iprot.readString();
            struct.projections.add(_elem78);
          }
        }
        struct.setProjectionsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.consistencyMode = com.xiaomi.infra.galaxy.sds.thrift.SecondaryIndexConsistencyMode.findByValue(iprot.readI32());
        struct.setConsistencyModeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.unique = iprot.readBool();
        struct.setUniqueIsSet(true);
      }
    }
  }

}

