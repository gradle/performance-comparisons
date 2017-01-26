package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23003 {
    private final Productionnull_23003 production = new Productionnull_23003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}