package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28129 {
    private final Productionnull_28129 production = new Productionnull_28129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}