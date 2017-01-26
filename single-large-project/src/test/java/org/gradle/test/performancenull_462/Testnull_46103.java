package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46103 {
    private final Productionnull_46103 production = new Productionnull_46103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}