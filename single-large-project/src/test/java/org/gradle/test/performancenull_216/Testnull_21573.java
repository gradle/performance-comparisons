package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21573 {
    private final Productionnull_21573 production = new Productionnull_21573("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}