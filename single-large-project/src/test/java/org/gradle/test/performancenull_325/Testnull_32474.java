package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32474 {
    private final Productionnull_32474 production = new Productionnull_32474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}