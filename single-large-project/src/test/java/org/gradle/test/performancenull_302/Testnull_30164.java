package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30164 {
    private final Productionnull_30164 production = new Productionnull_30164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}