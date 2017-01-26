package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21539 {
    private final Productionnull_21539 production = new Productionnull_21539("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}