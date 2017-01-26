package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34601 {
    private final Productionnull_34601 production = new Productionnull_34601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}