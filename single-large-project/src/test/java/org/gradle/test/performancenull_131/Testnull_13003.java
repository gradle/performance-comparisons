package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13003 {
    private final Productionnull_13003 production = new Productionnull_13003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}