package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40193 {
    private final Productionnull_40193 production = new Productionnull_40193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}