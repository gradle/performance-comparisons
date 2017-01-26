package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32489 {
    private final Productionnull_32489 production = new Productionnull_32489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}