package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42172 {
    private final Productionnull_42172 production = new Productionnull_42172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}