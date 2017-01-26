package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34260 {
    private final Productionnull_34260 production = new Productionnull_34260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}