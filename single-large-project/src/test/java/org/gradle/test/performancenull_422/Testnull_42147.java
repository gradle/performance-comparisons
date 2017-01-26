package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42147 {
    private final Productionnull_42147 production = new Productionnull_42147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}