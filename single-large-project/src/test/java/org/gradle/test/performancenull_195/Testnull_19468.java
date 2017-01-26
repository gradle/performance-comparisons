package org.gradle.test.performancenull_195;

import static org.junit.Assert.*;

public class Testnull_19468 {
    private final Productionnull_19468 production = new Productionnull_19468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}