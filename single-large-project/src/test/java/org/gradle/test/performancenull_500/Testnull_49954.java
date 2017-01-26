package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49954 {
    private final Productionnull_49954 production = new Productionnull_49954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}