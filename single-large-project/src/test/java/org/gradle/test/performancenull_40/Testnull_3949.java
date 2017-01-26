package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3949 {
    private final Productionnull_3949 production = new Productionnull_3949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}