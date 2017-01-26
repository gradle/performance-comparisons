package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10962 {
    private final Productionnull_10962 production = new Productionnull_10962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}