package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25045 {
    private final Productionnull_25045 production = new Productionnull_25045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}