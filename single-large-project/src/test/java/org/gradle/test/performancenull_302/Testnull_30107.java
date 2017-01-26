package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30107 {
    private final Productionnull_30107 production = new Productionnull_30107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}