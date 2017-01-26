package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34268 {
    private final Productionnull_34268 production = new Productionnull_34268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}