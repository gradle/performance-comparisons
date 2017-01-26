package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46129 {
    private final Productionnull_46129 production = new Productionnull_46129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}