package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2082 {
    private final Productionnull_2082 production = new Productionnull_2082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}