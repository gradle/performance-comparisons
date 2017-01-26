package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3303 {
    private final Productionnull_3303 production = new Productionnull_3303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}