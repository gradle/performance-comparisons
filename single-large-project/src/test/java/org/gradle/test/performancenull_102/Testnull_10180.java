package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10180 {
    private final Productionnull_10180 production = new Productionnull_10180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}