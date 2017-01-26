package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20624 {
    private final Productionnull_20624 production = new Productionnull_20624("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}