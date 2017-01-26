package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40060 {
    private final Productionnull_40060 production = new Productionnull_40060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}