package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6150 {
    private final Productionnull_6150 production = new Productionnull_6150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}