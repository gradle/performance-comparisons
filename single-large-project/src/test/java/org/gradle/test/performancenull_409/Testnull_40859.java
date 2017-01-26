package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40859 {
    private final Productionnull_40859 production = new Productionnull_40859("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}