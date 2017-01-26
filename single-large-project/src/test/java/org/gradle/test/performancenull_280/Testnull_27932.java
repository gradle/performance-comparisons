package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27932 {
    private final Productionnull_27932 production = new Productionnull_27932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}