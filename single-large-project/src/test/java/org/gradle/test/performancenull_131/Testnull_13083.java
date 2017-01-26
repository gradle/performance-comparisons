package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13083 {
    private final Productionnull_13083 production = new Productionnull_13083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}