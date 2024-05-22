// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Trade.proto

package dominvest.backend.core.model;

public interface TradeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dominvest.backend.core.model.Trade)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.dominvest.backend.core.model.Date date = 1;</code>
   */
  boolean hasDate();
  /**
   * <code>.dominvest.backend.core.model.Date date = 1;</code>
   */
  dominvest.backend.core.model.Date getDate();
  /**
   * <code>.dominvest.backend.core.model.Date date = 1;</code>
   */
  dominvest.backend.core.model.DateOrBuilder getDateOrBuilder();

  /**
   * <code>.dominvest.backend.core.model.Time time = 2;</code>
   */
  boolean hasTime();
  /**
   * <code>.dominvest.backend.core.model.Time time = 2;</code>
   */
  dominvest.backend.core.model.Time getTime();
  /**
   * <code>.dominvest.backend.core.model.Time time = 2;</code>
   */
  dominvest.backend.core.model.TimeOrBuilder getTimeOrBuilder();

  /**
   * <code>string clientId = 3;</code>
   */
  java.lang.String getClientId();
  /**
   * <code>string clientId = 3;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string ticker = 4;</code>
   */
  java.lang.String getTicker();
  /**
   * <code>string ticker = 4;</code>
   */
  com.google.protobuf.ByteString
      getTickerBytes();

  /**
   * <code>.dominvest.backend.core.model.Side side = 5;</code>
   */
  int getSideValue();
  /**
   * <code>.dominvest.backend.core.model.Side side = 5;</code>
   */
  dominvest.backend.core.model.Side getSide();

  /**
   * <code>.dominvest.backend.core.model.Decimal price = 6;</code>
   */
  boolean hasPrice();
  /**
   * <code>.dominvest.backend.core.model.Decimal price = 6;</code>
   */
  dominvest.backend.core.model.Decimal getPrice();
  /**
   * <code>.dominvest.backend.core.model.Decimal price = 6;</code>
   */
  dominvest.backend.core.model.DecimalOrBuilder getPriceOrBuilder();

  /**
   * <code>.dominvest.backend.core.model.Decimal qty = 7;</code>
   */
  boolean hasQty();
  /**
   * <code>.dominvest.backend.core.model.Decimal qty = 7;</code>
   */
  dominvest.backend.core.model.Decimal getQty();
  /**
   * <code>.dominvest.backend.core.model.Decimal qty = 7;</code>
   */
  dominvest.backend.core.model.DecimalOrBuilder getQtyOrBuilder();

  /**
   * <code>.dominvest.backend.core.model.Date settlementdate = 8;</code>
   */
  boolean hasSettlementdate();
  /**
   * <code>.dominvest.backend.core.model.Date settlementdate = 8;</code>
   */
  dominvest.backend.core.model.Date getSettlementdate();
  /**
   * <code>.dominvest.backend.core.model.Date settlementdate = 8;</code>
   */
  dominvest.backend.core.model.DateOrBuilder getSettlementdateOrBuilder();

  /**
   * <code>string orderid = 9;</code>
   */
  java.lang.String getOrderid();
  /**
   * <code>string orderid = 9;</code>
   */
  com.google.protobuf.ByteString
      getOrderidBytes();

  /**
   * <code>string market = 10;</code>
   */
  java.lang.String getMarket();
  /**
   * <code>string market = 10;</code>
   */
  com.google.protobuf.ByteString
      getMarketBytes();

  /**
   * <code>.dominvest.backend.core.model.Decimal brokerfee = 11;</code>
   */
  boolean hasBrokerfee();
  /**
   * <code>.dominvest.backend.core.model.Decimal brokerfee = 11;</code>
   */
  dominvest.backend.core.model.Decimal getBrokerfee();
  /**
   * <code>.dominvest.backend.core.model.Decimal brokerfee = 11;</code>
   */
  dominvest.backend.core.model.DecimalOrBuilder getBrokerfeeOrBuilder();

  /**
   * <code>.dominvest.backend.core.model.Decimal marketfee = 12;</code>
   */
  boolean hasMarketfee();
  /**
   * <code>.dominvest.backend.core.model.Decimal marketfee = 12;</code>
   */
  dominvest.backend.core.model.Decimal getMarketfee();
  /**
   * <code>.dominvest.backend.core.model.Decimal marketfee = 12;</code>
   */
  dominvest.backend.core.model.DecimalOrBuilder getMarketfeeOrBuilder();

  /**
   * <code>string marketboard = 13;</code>
   */
  java.lang.String getMarketboard();
  /**
   * <code>string marketboard = 13;</code>
   */
  com.google.protobuf.ByteString
      getMarketboardBytes();

  /**
   * <code>string currency = 14;</code>
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 14;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>string execId = 15;</code>
   */
  java.lang.String getExecId();
  /**
   * <code>string execId = 15;</code>
   */
  com.google.protobuf.ByteString
      getExecIdBytes();
}
