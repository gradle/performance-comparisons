package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10129 {
    private final Productionnull_10129 production = new Productionnull_10129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}