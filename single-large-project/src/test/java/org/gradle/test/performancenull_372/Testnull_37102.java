package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37102 {
    private final Productionnull_37102 production = new Productionnull_37102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}