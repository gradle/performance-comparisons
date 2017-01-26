package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42381 {
    private final Productionnull_42381 production = new Productionnull_42381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}