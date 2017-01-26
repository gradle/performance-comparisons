package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10186 {
    private final Productionnull_10186 production = new Productionnull_10186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}