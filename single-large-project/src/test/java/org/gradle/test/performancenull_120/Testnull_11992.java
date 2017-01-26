package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11992 {
    private final Productionnull_11992 production = new Productionnull_11992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}