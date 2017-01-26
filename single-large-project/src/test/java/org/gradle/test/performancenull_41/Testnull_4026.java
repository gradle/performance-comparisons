package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4026 {
    private final Productionnull_4026 production = new Productionnull_4026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}