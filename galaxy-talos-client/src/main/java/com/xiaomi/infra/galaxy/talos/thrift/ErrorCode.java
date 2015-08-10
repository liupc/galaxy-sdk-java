/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

public enum ErrorCode implements libthrift091.TEnum {
  TOPIC_EXIST(0),
  TOPIC_NOT_EXIST(1),
  QUOTA_NOT_EXIST(2),
  LOCK_EXIST(3),
  LOCK_NOT_EXIST(4),
  LOCK_VALUE_NOT_EXPECTED(5),
  MESSAGE_INCOMPLETE(6),
  MESSAGE_INDEX_UNDESIRED_ERROR(7),
  MESSAGE_INDEX_NOT_EXIST(8),
  MESSAGE_INDEX_OUT_OF_RANGE(9),
  INVALID_TOPIC_NAME(10),
  HDFS_OPERATION_FAILED(11),
  HBASE_OPERATION_FAILED(12),
  INTERNAL_SERVER_ERROR(13);

  private final int value;

  private ErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return TOPIC_EXIST;
      case 1:
        return TOPIC_NOT_EXIST;
      case 2:
        return QUOTA_NOT_EXIST;
      case 3:
        return LOCK_EXIST;
      case 4:
        return LOCK_NOT_EXIST;
      case 5:
        return LOCK_VALUE_NOT_EXPECTED;
      case 6:
        return MESSAGE_INCOMPLETE;
      case 7:
        return MESSAGE_INDEX_UNDESIRED_ERROR;
      case 8:
        return MESSAGE_INDEX_NOT_EXIST;
      case 9:
        return MESSAGE_INDEX_OUT_OF_RANGE;
      case 10:
        return INVALID_TOPIC_NAME;
      case 11:
        return HDFS_OPERATION_FAILED;
      case 12:
        return HBASE_OPERATION_FAILED;
      case 13:
        return INTERNAL_SERVER_ERROR;
      default:
        return null;
    }
  }
}