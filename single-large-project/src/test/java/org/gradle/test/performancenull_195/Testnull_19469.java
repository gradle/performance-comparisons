package org.gradle.test.performancenull_195;

import static org.junit.Assert.*;

public class Testnull_19469 {
    private final Productionnull_19469 production = new Productionnull_19469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}