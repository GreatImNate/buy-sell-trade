-- CREATE SCHEMA buy_sell_trade;
-- CREATE USER buy_sell_trade_admin WITH PASSWORD 'password';
-- ALTER DATABASE buy_sell_trade OWNER TO buy_sell_trade_admin;
-- GRANT ALL PRIVILEGES ON DATABASE buy_sell_trade TO buy_sell_trade_admin;
-- GRANT ALL ON SCHEMA  public TO buy_sell_trade_admin;
CREATE SEQUENCE buy_sell_trade.s_listing_id START WITH 1;

CREATE TABLE buy_sell_trade.listing (
    id INT NOT NULL,
    CONSTRAINT pk_t_listing PRIMARY KEY (ID)
);