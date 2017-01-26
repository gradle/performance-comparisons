package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16001 {
    private final Productionnull_16001 production = new Productionnull_16001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}