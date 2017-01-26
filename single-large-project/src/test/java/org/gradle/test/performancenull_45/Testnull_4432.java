package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4432 {
    private final Productionnull_4432 production = new Productionnull_4432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}