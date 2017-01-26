package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33443 {
    private final Productionnull_33443 production = new Productionnull_33443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}