package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17944 {
    private final Productionnull_17944 production = new Productionnull_17944("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}