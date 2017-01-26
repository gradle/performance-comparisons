package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30142 {
    private final Productionnull_30142 production = new Productionnull_30142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}