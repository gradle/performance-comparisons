package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21848 {
    private final Productionnull_21848 production = new Productionnull_21848("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}