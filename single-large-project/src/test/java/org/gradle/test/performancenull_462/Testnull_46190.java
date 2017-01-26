package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46190 {
    private final Productionnull_46190 production = new Productionnull_46190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}