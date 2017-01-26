package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12798 {
    private final Productionnull_12798 production = new Productionnull_12798("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}