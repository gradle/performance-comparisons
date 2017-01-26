package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46186 {
    private final Productionnull_46186 production = new Productionnull_46186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}