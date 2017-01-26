package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25562 {
    private final Productionnull_25562 production = new Productionnull_25562("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}