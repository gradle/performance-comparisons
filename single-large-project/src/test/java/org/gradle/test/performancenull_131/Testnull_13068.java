package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13068 {
    private final Productionnull_13068 production = new Productionnull_13068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}