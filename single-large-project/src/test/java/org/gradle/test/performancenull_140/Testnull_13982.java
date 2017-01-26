package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13982 {
    private final Productionnull_13982 production = new Productionnull_13982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}