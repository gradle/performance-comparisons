package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18068 {
    private final Productionnull_18068 production = new Productionnull_18068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}