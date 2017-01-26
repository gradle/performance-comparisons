package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36172 {
    private final Productionnull_36172 production = new Productionnull_36172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}