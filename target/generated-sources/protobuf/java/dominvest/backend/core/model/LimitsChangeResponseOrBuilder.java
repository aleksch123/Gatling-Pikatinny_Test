// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PortfolioAtheneService.proto

package dominvest.backend.core.model;

public interface LimitsChangeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dominvest.backend.core.model.LimitsChangeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.dominvest.backend.core.model.ErrorCode error = 1;</code>
   */
  boolean hasError();
  /**
   * <code>.dominvest.backend.core.model.ErrorCode error = 1;</code>
   */
  dominvest.backend.core.model.ErrorCodeOuterClass.ErrorCode getError();
  /**
   * <code>.dominvest.backend.core.model.ErrorCode error = 1;</code>
   */
  dominvest.backend.core.model.ErrorCodeOuterClass.ErrorCodeOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * id запроса
   * </pre>
   *
   * <code>string requestId = 2;</code>
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * id запроса
   * </pre>
   *
   * <code>string requestId = 2;</code>
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
