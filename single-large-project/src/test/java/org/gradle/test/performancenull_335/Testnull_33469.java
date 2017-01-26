package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33469 {
    private final Productionnull_33469 production = new Productionnull_33469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}