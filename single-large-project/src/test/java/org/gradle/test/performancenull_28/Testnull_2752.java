package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2752 {
    private final Productionnull_2752 production = new Productionnull_2752("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}