package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25965 {
    private final Productionnull_25965 production = new Productionnull_25965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}