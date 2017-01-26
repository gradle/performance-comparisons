package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3380 {
    private final Productionnull_3380 production = new Productionnull_3380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}