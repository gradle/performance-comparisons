package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21869 {
    private final Productionnull_21869 production = new Productionnull_21869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}