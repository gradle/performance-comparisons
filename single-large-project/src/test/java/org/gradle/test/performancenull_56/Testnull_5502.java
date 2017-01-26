package org.gradle.test.performancenull_56;

import static org.junit.Assert.*;

public class Testnull_5502 {
    private final Productionnull_5502 production = new Productionnull_5502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}