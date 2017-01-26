package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4765 {
    private final Productionnull_4765 production = new Productionnull_4765("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}