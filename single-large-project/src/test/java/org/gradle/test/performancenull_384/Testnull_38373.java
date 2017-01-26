package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38373 {
    private final Productionnull_38373 production = new Productionnull_38373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}