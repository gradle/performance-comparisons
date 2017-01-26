package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30104 {
    private final Productionnull_30104 production = new Productionnull_30104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}