package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3281 {
    private final Productionnull_3281 production = new Productionnull_3281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}