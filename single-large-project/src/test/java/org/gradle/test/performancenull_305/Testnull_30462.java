package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30462 {
    private final Productionnull_30462 production = new Productionnull_30462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}