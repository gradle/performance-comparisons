package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20135 {
    private final Productionnull_20135 production = new Productionnull_20135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}