package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3876 {
    private final Productionnull_3876 production = new Productionnull_3876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}