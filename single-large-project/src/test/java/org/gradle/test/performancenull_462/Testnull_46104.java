package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46104 {
    private final Productionnull_46104 production = new Productionnull_46104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}