package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6154 {
    private final Productionnull_6154 production = new Productionnull_6154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}