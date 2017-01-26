package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8071 {
    private final Productionnull_8071 production = new Productionnull_8071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}