package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3209 {
    private final Productionnull_3209 production = new Productionnull_3209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}