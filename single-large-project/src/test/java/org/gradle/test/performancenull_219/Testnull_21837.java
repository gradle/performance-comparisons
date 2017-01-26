package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21837 {
    private final Productionnull_21837 production = new Productionnull_21837("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}