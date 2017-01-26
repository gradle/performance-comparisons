package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43962 {
    private final Productionnull_43962 production = new Productionnull_43962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}