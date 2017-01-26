package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33441 {
    private final Productionnull_33441 production = new Productionnull_33441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}