package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34283 {
    private final Productionnull_34283 production = new Productionnull_34283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}