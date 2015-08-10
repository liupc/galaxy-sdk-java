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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-4")
public class Message implements libthrift091.TBase<Message, Message._Fields>, java.io.Serializable, Cloneable, Comparable<Message> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Message");

  private static final libthrift091.protocol.TField PARTITION_KEY_FIELD_DESC = new libthrift091.protocol.TField("partitionKey", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SEQUENCE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("sequenceNumber", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField MESSAGE_FIELD_DESC = new libthrift091.protocol.TField("message", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageTupleSchemeFactory());
  }

  /**
   * The partitionkey for this message, Talos Producer will use the partitionKey
   * to determine which partition to send;
   * 
   */
  public String partitionKey; // optional
  /**
   * The sequenceNumber is the unique identifier for the message in Talos, user
   * can use this to determine whether the message is repeated when consume;
   * 
   */
  public String sequenceNumber; // required
  /**
   * the message data, max size is 1MB (1B ~ 1MB);
   * 
   */
  public ByteBuffer message; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The partitionkey for this message, Talos Producer will use the partitionKey
     * to determine which partition to send;
     * 
     */
    PARTITION_KEY((short)1, "partitionKey"),
    /**
     * The sequenceNumber is the unique identifier for the message in Talos, user
     * can use this to determine whether the message is repeated when consume;
     * 
     */
    SEQUENCE_NUMBER((short)2, "sequenceNumber"),
    /**
     * the message data, max size is 1MB (1B ~ 1MB);
     * 
     */
    MESSAGE((short)3, "message");

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
        case 1: // PARTITION_KEY
          return PARTITION_KEY;
        case 2: // SEQUENCE_NUMBER
          return SEQUENCE_NUMBER;
        case 3: // MESSAGE
          return MESSAGE;
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
  private static final _Fields optionals[] = {_Fields.PARTITION_KEY};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_KEY, new libthrift091.meta_data.FieldMetaData("partitionKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEQUENCE_NUMBER, new libthrift091.meta_data.FieldMetaData("sequenceNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new libthrift091.meta_data.FieldMetaData("message", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Message.class, metaDataMap);
  }

  public Message() {
  }

  public Message(
    String sequenceNumber,
    ByteBuffer message)
  {
    this();
    this.sequenceNumber = sequenceNumber;
    this.message = libthrift091.TBaseHelper.copyBinary(message);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Message(Message other) {
    if (other.isSetPartitionKey()) {
      this.partitionKey = other.partitionKey;
    }
    if (other.isSetSequenceNumber()) {
      this.sequenceNumber = other.sequenceNumber;
    }
    if (other.isSetMessage()) {
      this.message = libthrift091.TBaseHelper.copyBinary(other.message);
    }
  }

  public Message deepCopy() {
    return new Message(this);
  }

  @Override
  public void clear() {
    this.partitionKey = null;
    this.sequenceNumber = null;
    this.message = null;
  }

  /**
   * The partitionkey for this message, Talos Producer will use the partitionKey
   * to determine which partition to send;
   * 
   */
  public String getPartitionKey() {
    return this.partitionKey;
  }

  /**
   * The partitionkey for this message, Talos Producer will use the partitionKey
   * to determine which partition to send;
   * 
   */
  public Message setPartitionKey(String partitionKey) {
    this.partitionKey = partitionKey;
    return this;
  }

  public void unsetPartitionKey() {
    this.partitionKey = null;
  }

  /** Returns true if field partitionKey is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionKey() {
    return this.partitionKey != null;
  }

  public void setPartitionKeyIsSet(boolean value) {
    if (!value) {
      this.partitionKey = null;
    }
  }

  /**
   * The sequenceNumber is the unique identifier for the message in Talos, user
   * can use this to determine whether the message is repeated when consume;
   * 
   */
  public String getSequenceNumber() {
    return this.sequenceNumber;
  }

  /**
   * The sequenceNumber is the unique identifier for the message in Talos, user
   * can use this to determine whether the message is repeated when consume;
   * 
   */
  public Message setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  public void unsetSequenceNumber() {
    this.sequenceNumber = null;
  }

  /** Returns true if field sequenceNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceNumber() {
    return this.sequenceNumber != null;
  }

  public void setSequenceNumberIsSet(boolean value) {
    if (!value) {
      this.sequenceNumber = null;
    }
  }

  /**
   * the message data, max size is 1MB (1B ~ 1MB);
   * 
   */
  public byte[] getMessage() {
    setMessage(libthrift091.TBaseHelper.rightSize(message));
    return message == null ? null : message.array();
  }

  public ByteBuffer bufferForMessage() {
    return libthrift091.TBaseHelper.copyBinary(message);
  }

  /**
   * the message data, max size is 1MB (1B ~ 1MB);
   * 
   */
  public Message setMessage(byte[] message) {
    this.message = message == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(message, message.length));
    return this;
  }

  public Message setMessage(ByteBuffer message) {
    this.message = libthrift091.TBaseHelper.copyBinary(message);
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_KEY:
      if (value == null) {
        unsetPartitionKey();
      } else {
        setPartitionKey((String)value);
      }
      break;

    case SEQUENCE_NUMBER:
      if (value == null) {
        unsetSequenceNumber();
      } else {
        setSequenceNumber((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_KEY:
      return getPartitionKey();

    case SEQUENCE_NUMBER:
      return getSequenceNumber();

    case MESSAGE:
      return getMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_KEY:
      return isSetPartitionKey();
    case SEQUENCE_NUMBER:
      return isSetSequenceNumber();
    case MESSAGE:
      return isSetMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Message)
      return this.equals((Message)that);
    return false;
  }

  public boolean equals(Message that) {
    if (that == null)
      return false;

    boolean this_present_partitionKey = true && this.isSetPartitionKey();
    boolean that_present_partitionKey = true && that.isSetPartitionKey();
    if (this_present_partitionKey || that_present_partitionKey) {
      if (!(this_present_partitionKey && that_present_partitionKey))
        return false;
      if (!this.partitionKey.equals(that.partitionKey))
        return false;
    }

    boolean this_present_sequenceNumber = true && this.isSetSequenceNumber();
    boolean that_present_sequenceNumber = true && that.isSetSequenceNumber();
    if (this_present_sequenceNumber || that_present_sequenceNumber) {
      if (!(this_present_sequenceNumber && that_present_sequenceNumber))
        return false;
      if (!this.sequenceNumber.equals(that.sequenceNumber))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_partitionKey = true && (isSetPartitionKey());
    list.add(present_partitionKey);
    if (present_partitionKey)
      list.add(partitionKey);

    boolean present_sequenceNumber = true && (isSetSequenceNumber());
    list.add(present_sequenceNumber);
    if (present_sequenceNumber)
      list.add(sequenceNumber);

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    return list.hashCode();
  }

  @Override
  public int compareTo(Message other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartitionKey()).compareTo(other.isSetPartitionKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionKey, other.partitionKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequenceNumber()).compareTo(other.isSetSequenceNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sequenceNumber, other.sequenceNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.message, other.message);
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
    StringBuilder sb = new StringBuilder("Message(");
    boolean first = true;

    if (isSetPartitionKey()) {
      sb.append("partitionKey:");
      if (this.partitionKey == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionKey);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("sequenceNumber:");
    if (this.sequenceNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.sequenceNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      libthrift091.TBaseHelper.toString(this.message, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (sequenceNumber == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'sequenceNumber' was not present! Struct: " + toString());
    }
    if (message == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
    }
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

  private static class MessageStandardSchemeFactory implements SchemeFactory {
    public MessageStandardScheme getScheme() {
      return new MessageStandardScheme();
    }
  }

  private static class MessageStandardScheme extends StandardScheme<Message> {

    public void read(libthrift091.protocol.TProtocol iprot, Message struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_KEY
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.partitionKey = iprot.readString();
              struct.setPartitionKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEQUENCE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.sequenceNumber = iprot.readString();
              struct.setSequenceNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.message = iprot.readBinary();
              struct.setMessageIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Message struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitionKey != null) {
        if (struct.isSetPartitionKey()) {
          oprot.writeFieldBegin(PARTITION_KEY_FIELD_DESC);
          oprot.writeString(struct.partitionKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.sequenceNumber != null) {
        oprot.writeFieldBegin(SEQUENCE_NUMBER_FIELD_DESC);
        oprot.writeString(struct.sequenceNumber);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeBinary(struct.message);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageTupleSchemeFactory implements SchemeFactory {
    public MessageTupleScheme getScheme() {
      return new MessageTupleScheme();
    }
  }

  private static class MessageTupleScheme extends TupleScheme<Message> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Message struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.sequenceNumber);
      oprot.writeBinary(struct.message);
      BitSet optionals = new BitSet();
      if (struct.isSetPartitionKey()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPartitionKey()) {
        oprot.writeString(struct.partitionKey);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Message struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.sequenceNumber = iprot.readString();
      struct.setSequenceNumberIsSet(true);
      struct.message = iprot.readBinary();
      struct.setMessageIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.partitionKey = iprot.readString();
        struct.setPartitionKeyIsSet(true);
      }
    }
  }

}
