package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46150 {
    private final Productionnull_46150 production = new Productionnull_46150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}