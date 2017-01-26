package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8082 {
    private final Productionnull_8082 production = new Productionnull_8082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}