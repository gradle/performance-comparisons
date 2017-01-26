package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30113 {
    private final Productionnull_30113 production = new Productionnull_30113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}