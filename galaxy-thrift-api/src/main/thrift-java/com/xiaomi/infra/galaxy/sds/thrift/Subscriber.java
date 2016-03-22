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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-9")
public class Subscriber implements libthrift091.TBase<Subscriber, Subscriber._Fields>, java.io.Serializable, Cloneable, Comparable<Subscriber> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Subscriber");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SUBSCRIBER_NAME_FIELD_DESC = new libthrift091.protocol.TField("subscriberName", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField SUBSCRIBER_ID_FIELD_DESC = new libthrift091.protocol.TField("subscriberId", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SubscriberStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SubscriberTupleSchemeFactory());
  }

  /**
   * 表名
   */
  public String tableName; // optional
  /**
   * 订阅者名字
   */
  public String subscriberName; // optional
  /**
   * 订阅者ID,仅作为输出值，作为输入时无需指定
   */
  public String subscriberId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 表名
     */
    TABLE_NAME((short)1, "tableName"),
    /**
     * 订阅者名字
     */
    SUBSCRIBER_NAME((short)2, "subscriberName"),
    /**
     * 订阅者ID,仅作为输出值，作为输入时无需指定
     */
    SUBSCRIBER_ID((short)3, "subscriberId");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // SUBSCRIBER_NAME
          return SUBSCRIBER_NAME;
        case 3: // SUBSCRIBER_ID
          return SUBSCRIBER_ID;
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
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.SUBSCRIBER_NAME,_Fields.SUBSCRIBER_ID};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUBSCRIBER_NAME, new libthrift091.meta_data.FieldMetaData("subscriberName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUBSCRIBER_ID, new libthrift091.meta_data.FieldMetaData("subscriberId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Subscriber.class, metaDataMap);
  }

  public Subscriber() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Subscriber(Subscriber other) {
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetSubscriberName()) {
      this.subscriberName = other.subscriberName;
    }
    if (other.isSetSubscriberId()) {
      this.subscriberId = other.subscriberId;
    }
  }

  public Subscriber deepCopy() {
    return new Subscriber(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    this.subscriberName = null;
    this.subscriberId = null;
  }

  /**
   * 表名
   */
  public String getTableName() {
    return this.tableName;
  }

  /**
   * 表名
   */
  public Subscriber setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  /**
   * 订阅者名字
   */
  public String getSubscriberName() {
    return this.subscriberName;
  }

  /**
   * 订阅者名字
   */
  public Subscriber setSubscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
    return this;
  }

  public void unsetSubscriberName() {
    this.subscriberName = null;
  }

  /** Returns true if field subscriberName is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriberName() {
    return this.subscriberName != null;
  }

  public void setSubscriberNameIsSet(boolean value) {
    if (!value) {
      this.subscriberName = null;
    }
  }

  /**
   * 订阅者ID,仅作为输出值，作为输入时无需指定
   */
  public String getSubscriberId() {
    return this.subscriberId;
  }

  /**
   * 订阅者ID,仅作为输出值，作为输入时无需指定
   */
  public Subscriber setSubscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
    return this;
  }

  public void unsetSubscriberId() {
    this.subscriberId = null;
  }

  /** Returns true if field subscriberId is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriberId() {
    return this.subscriberId != null;
  }

  public void setSubscriberIdIsSet(boolean value) {
    if (!value) {
      this.subscriberId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case SUBSCRIBER_NAME:
      if (value == null) {
        unsetSubscriberName();
      } else {
        setSubscriberName((String)value);
      }
      break;

    case SUBSCRIBER_ID:
      if (value == null) {
        unsetSubscriberId();
      } else {
        setSubscriberId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case SUBSCRIBER_NAME:
      return getSubscriberName();

    case SUBSCRIBER_ID:
      return getSubscriberId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case SUBSCRIBER_NAME:
      return isSetSubscriberName();
    case SUBSCRIBER_ID:
      return isSetSubscriberId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Subscriber)
      return this.equals((Subscriber)that);
    return false;
  }

  public boolean equals(Subscriber that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_subscriberName = true && this.isSetSubscriberName();
    boolean that_present_subscriberName = true && that.isSetSubscriberName();
    if (this_present_subscriberName || that_present_subscriberName) {
      if (!(this_present_subscriberName && that_present_subscriberName))
        return false;
      if (!this.subscriberName.equals(that.subscriberName))
        return false;
    }

    boolean this_present_subscriberId = true && this.isSetSubscriberId();
    boolean that_present_subscriberId = true && that.isSetSubscriberId();
    if (this_present_subscriberId || that_present_subscriberId) {
      if (!(this_present_subscriberId && that_present_subscriberId))
        return false;
      if (!this.subscriberId.equals(that.subscriberId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_subscriberName = true && (isSetSubscriberName());
    list.add(present_subscriberName);
    if (present_subscriberName)
      list.add(subscriberName);

    boolean present_subscriberId = true && (isSetSubscriberId());
    list.add(present_subscriberId);
    if (present_subscriberId)
      list.add(subscriberId);

    return list.hashCode();
  }

  @Override
  public int compareTo(Subscriber other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubscriberName()).compareTo(other.isSetSubscriberName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriberName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.subscriberName, other.subscriberName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubscriberId()).compareTo(other.isSetSubscriberId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriberId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.subscriberId, other.subscriberId);
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
    StringBuilder sb = new StringBuilder("Subscriber(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetSubscriberName()) {
      if (!first) sb.append(", ");
      sb.append("subscriberName:");
      if (this.subscriberName == null) {
        sb.append("null");
      } else {
        sb.append(this.subscriberName);
      }
      first = false;
    }
    if (isSetSubscriberId()) {
      if (!first) sb.append(", ");
      sb.append("subscriberId:");
      if (this.subscriberId == null) {
        sb.append("null");
      } else {
        sb.append(this.subscriberId);
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

  private static class SubscriberStandardSchemeFactory implements SchemeFactory {
    public SubscriberStandardScheme getScheme() {
      return new SubscriberStandardScheme();
    }
  }

  private static class SubscriberStandardScheme extends StandardScheme<Subscriber> {

    public void read(libthrift091.protocol.TProtocol iprot, Subscriber struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUBSCRIBER_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.subscriberName = iprot.readString();
              struct.setSubscriberNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUBSCRIBER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.subscriberId = iprot.readString();
              struct.setSubscriberIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Subscriber struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.subscriberName != null) {
        if (struct.isSetSubscriberName()) {
          oprot.writeFieldBegin(SUBSCRIBER_NAME_FIELD_DESC);
          oprot.writeString(struct.subscriberName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.subscriberId != null) {
        if (struct.isSetSubscriberId()) {
          oprot.writeFieldBegin(SUBSCRIBER_ID_FIELD_DESC);
          oprot.writeString(struct.subscriberId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SubscriberTupleSchemeFactory implements SchemeFactory {
    public SubscriberTupleScheme getScheme() {
      return new SubscriberTupleScheme();
    }
  }

  private static class SubscriberTupleScheme extends TupleScheme<Subscriber> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Subscriber struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetSubscriberName()) {
        optionals.set(1);
      }
      if (struct.isSetSubscriberId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetSubscriberName()) {
        oprot.writeString(struct.subscriberName);
      }
      if (struct.isSetSubscriberId()) {
        oprot.writeString(struct.subscriberId);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Subscriber struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.subscriberName = iprot.readString();
        struct.setSubscriberNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.subscriberId = iprot.readString();
        struct.setSubscriberIdIsSet(true);
      }
    }
  }

}

