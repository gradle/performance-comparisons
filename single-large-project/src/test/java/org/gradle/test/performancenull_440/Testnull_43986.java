package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43986 {
    private final Productionnull_43986 production = new Productionnull_43986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}