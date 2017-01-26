package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33468 {
    private final Productionnull_33468 production = new Productionnull_33468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}