package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27441 {
    private final Productionnull_27441 production = new Productionnull_27441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}