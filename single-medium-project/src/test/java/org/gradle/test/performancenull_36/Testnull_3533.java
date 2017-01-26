package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3533 {
    private final Productionnull_3533 production = new Productionnull_3533("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}