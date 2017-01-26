package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30129 {
    private final Productionnull_30129 production = new Productionnull_30129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}