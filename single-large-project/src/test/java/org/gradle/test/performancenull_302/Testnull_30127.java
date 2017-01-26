package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30127 {
    private final Productionnull_30127 production = new Productionnull_30127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}