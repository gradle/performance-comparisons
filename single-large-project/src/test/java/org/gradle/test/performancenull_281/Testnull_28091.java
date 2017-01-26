package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28091 {
    private final Productionnull_28091 production = new Productionnull_28091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}