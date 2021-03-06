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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-18")
public class MessageBlock implements libthrift091.TBase<MessageBlock, MessageBlock._Fields>, java.io.Serializable, Cloneable, Comparable<MessageBlock> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("MessageBlock");

  private static final libthrift091.protocol.TField START_MESSAGE_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("startMessageOffset", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("messageNumber", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField COMPRESSION_TYPE_FIELD_DESC = new libthrift091.protocol.TField("compressionType", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField MESSAGE_BLOCK_FIELD_DESC = new libthrift091.protocol.TField("messageBlock", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField MESSAGE_BLOCK_SIZE_FIELD_DESC = new libthrift091.protocol.TField("messageBlockSize", libthrift091.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageBlockStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageBlockTupleSchemeFactory());
  }

  /**
   * the start message offset for this message block;
   * 
   */
  public long startMessageOffset; // required
  /**
   * the messageNumber for this message, if this message is compressed, the
   * messageNumber may greater than 1;
   * 
   */
  public int messageNumber; // required
  /**
   * compression type for this message, default is NONE;
   * 
   * 
   * @see MessageCompressionType
   */
  public MessageCompressionType compressionType; // required
  /**
   * message data, generated by List<Message>;
   * 
   */
  public ByteBuffer messageBlock; // required
  /**
   * the size for message block;
   * 
   */
  public int messageBlockSize; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * the start message offset for this message block;
     * 
     */
    START_MESSAGE_OFFSET((short)1, "startMessageOffset"),
    /**
     * the messageNumber for this message, if this message is compressed, the
     * messageNumber may greater than 1;
     * 
     */
    MESSAGE_NUMBER((short)2, "messageNumber"),
    /**
     * compression type for this message, default is NONE;
     * 
     * 
     * @see MessageCompressionType
     */
    COMPRESSION_TYPE((short)3, "compressionType"),
    /**
     * message data, generated by List<Message>;
     * 
     */
    MESSAGE_BLOCK((short)4, "messageBlock"),
    /**
     * the size for message block;
     * 
     */
    MESSAGE_BLOCK_SIZE((short)5, "messageBlockSize");

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
        case 1: // START_MESSAGE_OFFSET
          return START_MESSAGE_OFFSET;
        case 2: // MESSAGE_NUMBER
          return MESSAGE_NUMBER;
        case 3: // COMPRESSION_TYPE
          return COMPRESSION_TYPE;
        case 4: // MESSAGE_BLOCK
          return MESSAGE_BLOCK;
        case 5: // MESSAGE_BLOCK_SIZE
          return MESSAGE_BLOCK_SIZE;
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
  private static final int __STARTMESSAGEOFFSET_ISSET_ID = 0;
  private static final int __MESSAGENUMBER_ISSET_ID = 1;
  private static final int __MESSAGEBLOCKSIZE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MESSAGE_BLOCK_SIZE};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_MESSAGE_OFFSET, new libthrift091.meta_data.FieldMetaData("startMessageOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("messageNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPRESSION_TYPE, new libthrift091.meta_data.FieldMetaData("compressionType", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MessageCompressionType.class)));
    tmpMap.put(_Fields.MESSAGE_BLOCK, new libthrift091.meta_data.FieldMetaData("messageBlock", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.MESSAGE_BLOCK_SIZE, new libthrift091.meta_data.FieldMetaData("messageBlockSize", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(MessageBlock.class, metaDataMap);
  }

  public MessageBlock() {
    this.compressionType = com.xiaomi.infra.galaxy.talos.thrift.MessageCompressionType.NONE;

  }

  public MessageBlock(
    long startMessageOffset,
    int messageNumber,
    MessageCompressionType compressionType,
    ByteBuffer messageBlock)
  {
    this();
    this.startMessageOffset = startMessageOffset;
    setStartMessageOffsetIsSet(true);
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    this.compressionType = compressionType;
    this.messageBlock = libthrift091.TBaseHelper.copyBinary(messageBlock);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageBlock(MessageBlock other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startMessageOffset = other.startMessageOffset;
    this.messageNumber = other.messageNumber;
    if (other.isSetCompressionType()) {
      this.compressionType = other.compressionType;
    }
    if (other.isSetMessageBlock()) {
      this.messageBlock = libthrift091.TBaseHelper.copyBinary(other.messageBlock);
    }
    this.messageBlockSize = other.messageBlockSize;
  }

  public MessageBlock deepCopy() {
    return new MessageBlock(this);
  }

  @Override
  public void clear() {
    setStartMessageOffsetIsSet(false);
    this.startMessageOffset = 0;
    setMessageNumberIsSet(false);
    this.messageNumber = 0;
    this.compressionType = com.xiaomi.infra.galaxy.talos.thrift.MessageCompressionType.NONE;

    this.messageBlock = null;
    setMessageBlockSizeIsSet(false);
    this.messageBlockSize = 0;
  }

  /**
   * the start message offset for this message block;
   * 
   */
  public long getStartMessageOffset() {
    return this.startMessageOffset;
  }

  /**
   * the start message offset for this message block;
   * 
   */
  public MessageBlock setStartMessageOffset(long startMessageOffset) {
    this.startMessageOffset = startMessageOffset;
    setStartMessageOffsetIsSet(true);
    return this;
  }

  public void unsetStartMessageOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTMESSAGEOFFSET_ISSET_ID);
  }

  /** Returns true if field startMessageOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetStartMessageOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTMESSAGEOFFSET_ISSET_ID);
  }

  public void setStartMessageOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTMESSAGEOFFSET_ISSET_ID, value);
  }

  /**
   * the messageNumber for this message, if this message is compressed, the
   * messageNumber may greater than 1;
   * 
   */
  public int getMessageNumber() {
    return this.messageNumber;
  }

  /**
   * the messageNumber for this message, if this message is compressed, the
   * messageNumber may greater than 1;
   * 
   */
  public MessageBlock setMessageNumber(int messageNumber) {
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    return this;
  }

  public void unsetMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field messageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  public void setMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * compression type for this message, default is NONE;
   * 
   * 
   * @see MessageCompressionType
   */
  public MessageCompressionType getCompressionType() {
    return this.compressionType;
  }

  /**
   * compression type for this message, default is NONE;
   * 
   * 
   * @see MessageCompressionType
   */
  public MessageBlock setCompressionType(MessageCompressionType compressionType) {
    this.compressionType = compressionType;
    return this;
  }

  public void unsetCompressionType() {
    this.compressionType = null;
  }

  /** Returns true if field compressionType is set (has been assigned a value) and false otherwise */
  public boolean isSetCompressionType() {
    return this.compressionType != null;
  }

  public void setCompressionTypeIsSet(boolean value) {
    if (!value) {
      this.compressionType = null;
    }
  }

  /**
   * message data, generated by List<Message>;
   * 
   */
  public byte[] getMessageBlock() {
    setMessageBlock(libthrift091.TBaseHelper.rightSize(messageBlock));
    return messageBlock == null ? null : messageBlock.array();
  }

  public ByteBuffer bufferForMessageBlock() {
    return libthrift091.TBaseHelper.copyBinary(messageBlock);
  }

  /**
   * message data, generated by List<Message>;
   * 
   */
  public MessageBlock setMessageBlock(byte[] messageBlock) {
    this.messageBlock = messageBlock == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(messageBlock, messageBlock.length));
    return this;
  }

  public MessageBlock setMessageBlock(ByteBuffer messageBlock) {
    this.messageBlock = libthrift091.TBaseHelper.copyBinary(messageBlock);
    return this;
  }

  public void unsetMessageBlock() {
    this.messageBlock = null;
  }

  /** Returns true if field messageBlock is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBlock() {
    return this.messageBlock != null;
  }

  public void setMessageBlockIsSet(boolean value) {
    if (!value) {
      this.messageBlock = null;
    }
  }

  /**
   * the size for message block;
   * 
   */
  public int getMessageBlockSize() {
    return this.messageBlockSize;
  }

  /**
   * the size for message block;
   * 
   */
  public MessageBlock setMessageBlockSize(int messageBlockSize) {
    this.messageBlockSize = messageBlockSize;
    setMessageBlockSizeIsSet(true);
    return this;
  }

  public void unsetMessageBlockSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGEBLOCKSIZE_ISSET_ID);
  }

  /** Returns true if field messageBlockSize is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBlockSize() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGEBLOCKSIZE_ISSET_ID);
  }

  public void setMessageBlockSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGEBLOCKSIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_MESSAGE_OFFSET:
      if (value == null) {
        unsetStartMessageOffset();
      } else {
        setStartMessageOffset((Long)value);
      }
      break;

    case MESSAGE_NUMBER:
      if (value == null) {
        unsetMessageNumber();
      } else {
        setMessageNumber((Integer)value);
      }
      break;

    case COMPRESSION_TYPE:
      if (value == null) {
        unsetCompressionType();
      } else {
        setCompressionType((MessageCompressionType)value);
      }
      break;

    case MESSAGE_BLOCK:
      if (value == null) {
        unsetMessageBlock();
      } else {
        setMessageBlock((ByteBuffer)value);
      }
      break;

    case MESSAGE_BLOCK_SIZE:
      if (value == null) {
        unsetMessageBlockSize();
      } else {
        setMessageBlockSize((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_MESSAGE_OFFSET:
      return Long.valueOf(getStartMessageOffset());

    case MESSAGE_NUMBER:
      return Integer.valueOf(getMessageNumber());

    case COMPRESSION_TYPE:
      return getCompressionType();

    case MESSAGE_BLOCK:
      return getMessageBlock();

    case MESSAGE_BLOCK_SIZE:
      return Integer.valueOf(getMessageBlockSize());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_MESSAGE_OFFSET:
      return isSetStartMessageOffset();
    case MESSAGE_NUMBER:
      return isSetMessageNumber();
    case COMPRESSION_TYPE:
      return isSetCompressionType();
    case MESSAGE_BLOCK:
      return isSetMessageBlock();
    case MESSAGE_BLOCK_SIZE:
      return isSetMessageBlockSize();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageBlock)
      return this.equals((MessageBlock)that);
    return false;
  }

  public boolean equals(MessageBlock that) {
    if (that == null)
      return false;

    boolean this_present_startMessageOffset = true;
    boolean that_present_startMessageOffset = true;
    if (this_present_startMessageOffset || that_present_startMessageOffset) {
      if (!(this_present_startMessageOffset && that_present_startMessageOffset))
        return false;
      if (this.startMessageOffset != that.startMessageOffset)
        return false;
    }

    boolean this_present_messageNumber = true;
    boolean that_present_messageNumber = true;
    if (this_present_messageNumber || that_present_messageNumber) {
      if (!(this_present_messageNumber && that_present_messageNumber))
        return false;
      if (this.messageNumber != that.messageNumber)
        return false;
    }

    boolean this_present_compressionType = true && this.isSetCompressionType();
    boolean that_present_compressionType = true && that.isSetCompressionType();
    if (this_present_compressionType || that_present_compressionType) {
      if (!(this_present_compressionType && that_present_compressionType))
        return false;
      if (!this.compressionType.equals(that.compressionType))
        return false;
    }

    boolean this_present_messageBlock = true && this.isSetMessageBlock();
    boolean that_present_messageBlock = true && that.isSetMessageBlock();
    if (this_present_messageBlock || that_present_messageBlock) {
      if (!(this_present_messageBlock && that_present_messageBlock))
        return false;
      if (!this.messageBlock.equals(that.messageBlock))
        return false;
    }

    boolean this_present_messageBlockSize = true && this.isSetMessageBlockSize();
    boolean that_present_messageBlockSize = true && that.isSetMessageBlockSize();
    if (this_present_messageBlockSize || that_present_messageBlockSize) {
      if (!(this_present_messageBlockSize && that_present_messageBlockSize))
        return false;
      if (this.messageBlockSize != that.messageBlockSize)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_startMessageOffset = true;
    list.add(present_startMessageOffset);
    if (present_startMessageOffset)
      list.add(startMessageOffset);

    boolean present_messageNumber = true;
    list.add(present_messageNumber);
    if (present_messageNumber)
      list.add(messageNumber);

    boolean present_compressionType = true && (isSetCompressionType());
    list.add(present_compressionType);
    if (present_compressionType)
      list.add(compressionType.getValue());

    boolean present_messageBlock = true && (isSetMessageBlock());
    list.add(present_messageBlock);
    if (present_messageBlock)
      list.add(messageBlock);

    boolean present_messageBlockSize = true && (isSetMessageBlockSize());
    list.add(present_messageBlockSize);
    if (present_messageBlockSize)
      list.add(messageBlockSize);

    return list.hashCode();
  }

  @Override
  public int compareTo(MessageBlock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartMessageOffset()).compareTo(other.isSetStartMessageOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartMessageOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startMessageOffset, other.startMessageOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageNumber()).compareTo(other.isSetMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageNumber, other.messageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompressionType()).compareTo(other.isSetCompressionType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompressionType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.compressionType, other.compressionType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageBlock()).compareTo(other.isSetMessageBlock());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBlock()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageBlock, other.messageBlock);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageBlockSize()).compareTo(other.isSetMessageBlockSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBlockSize()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageBlockSize, other.messageBlockSize);
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
    StringBuilder sb = new StringBuilder("MessageBlock(");
    boolean first = true;

    sb.append("startMessageOffset:");
    sb.append(this.startMessageOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageNumber:");
    sb.append(this.messageNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("compressionType:");
    if (this.compressionType == null) {
      sb.append("null");
    } else {
      sb.append(this.compressionType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageBlock:");
    if (this.messageBlock == null) {
      sb.append("null");
    } else {
      libthrift091.TBaseHelper.toString(this.messageBlock, sb);
    }
    first = false;
    if (isSetMessageBlockSize()) {
      if (!first) sb.append(", ");
      sb.append("messageBlockSize:");
      sb.append(this.messageBlockSize);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'startMessageOffset' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'messageNumber' because it's a primitive and you chose the non-beans generator.
    if (compressionType == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'compressionType' was not present! Struct: " + toString());
    }
    if (messageBlock == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'messageBlock' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MessageBlockStandardSchemeFactory implements SchemeFactory {
    public MessageBlockStandardScheme getScheme() {
      return new MessageBlockStandardScheme();
    }
  }

  private static class MessageBlockStandardScheme extends StandardScheme<MessageBlock> {

    public void read(libthrift091.protocol.TProtocol iprot, MessageBlock struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_MESSAGE_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startMessageOffset = iprot.readI64();
              struct.setStartMessageOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.messageNumber = iprot.readI32();
              struct.setMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPRESSION_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.compressionType = com.xiaomi.infra.galaxy.talos.thrift.MessageCompressionType.findByValue(iprot.readI32());
              struct.setCompressionTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE_BLOCK
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.messageBlock = iprot.readBinary();
              struct.setMessageBlockIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MESSAGE_BLOCK_SIZE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.messageBlockSize = iprot.readI32();
              struct.setMessageBlockSizeIsSet(true);
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
      if (!struct.isSetStartMessageOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'startMessageOffset' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMessageNumber()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageNumber' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, MessageBlock struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(START_MESSAGE_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.startMessageOffset);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MESSAGE_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.messageNumber);
      oprot.writeFieldEnd();
      if (struct.compressionType != null) {
        oprot.writeFieldBegin(COMPRESSION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.compressionType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.messageBlock != null) {
        oprot.writeFieldBegin(MESSAGE_BLOCK_FIELD_DESC);
        oprot.writeBinary(struct.messageBlock);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMessageBlockSize()) {
        oprot.writeFieldBegin(MESSAGE_BLOCK_SIZE_FIELD_DESC);
        oprot.writeI32(struct.messageBlockSize);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageBlockTupleSchemeFactory implements SchemeFactory {
    public MessageBlockTupleScheme getScheme() {
      return new MessageBlockTupleScheme();
    }
  }

  private static class MessageBlockTupleScheme extends TupleScheme<MessageBlock> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, MessageBlock struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.startMessageOffset);
      oprot.writeI32(struct.messageNumber);
      oprot.writeI32(struct.compressionType.getValue());
      oprot.writeBinary(struct.messageBlock);
      BitSet optionals = new BitSet();
      if (struct.isSetMessageBlockSize()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMessageBlockSize()) {
        oprot.writeI32(struct.messageBlockSize);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, MessageBlock struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.startMessageOffset = iprot.readI64();
      struct.setStartMessageOffsetIsSet(true);
      struct.messageNumber = iprot.readI32();
      struct.setMessageNumberIsSet(true);
      struct.compressionType = com.xiaomi.infra.galaxy.talos.thrift.MessageCompressionType.findByValue(iprot.readI32());
      struct.setCompressionTypeIsSet(true);
      struct.messageBlock = iprot.readBinary();
      struct.setMessageBlockIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.messageBlockSize = iprot.readI32();
        struct.setMessageBlockSizeIsSet(true);
      }
    }
  }

}

