package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40861 {
    private final Productionnull_40861 production = new Productionnull_40861("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}