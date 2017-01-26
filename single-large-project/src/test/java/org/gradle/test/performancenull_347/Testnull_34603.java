package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34603 {
    private final Productionnull_34603 production = new Productionnull_34603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}