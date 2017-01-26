package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31265 {
    private final Productionnull_31265 production = new Productionnull_31265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}