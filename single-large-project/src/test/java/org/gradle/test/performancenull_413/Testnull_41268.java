package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41268 {
    private final Productionnull_41268 production = new Productionnull_41268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}