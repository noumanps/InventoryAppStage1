package com.example.nouman.inventoryappstage1.data;

import android.provider.BaseColumns;

public class InventoryContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private InventoryContract(){}

    /**
     * Inner class that defines constant values for the activity database table.
     * Each entry in the table represents a single entry.
     */
    public static final class InventoryEntry implements BaseColumns {

        /** Name of database table for Inventory */
        public final static String TABLE_NAME = "master_inventory";

        /**
         * Unique ID number for the activity (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the inventory Item.
         *
         * Type: Text
         */
        public final static String COLUMN_INVENTORY_NAME = "productName";

        /**
         * Price of the inventory Item.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_INVENTORY_PRICE ="productPrice";

        /**
         * Quantity of the inventory Item.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_INVENTORY_QUANTITY = "productQuantity";

        /**
         * Name of the inventory Item Supplier.
         *
         * Type: TEXT
         */
        public final static String COLUMN_INVENTORY_SUPPLIER = "supplierName";

        /**
         * Supplier Contact of the inventory Item.
         *
         * Type: TEXT
         */
        public final static String COLUMN_INVENTORY_CONTACT = "supplierContact";
    }
}