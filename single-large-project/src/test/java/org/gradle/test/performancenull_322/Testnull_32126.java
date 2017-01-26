package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32126 {
    private final Productionnull_32126 production = new Productionnull_32126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}