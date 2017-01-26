package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41292 {
    private final Productionnull_41292 production = new Productionnull_41292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}