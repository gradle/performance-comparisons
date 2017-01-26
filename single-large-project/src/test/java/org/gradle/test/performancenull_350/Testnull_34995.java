package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34995 {
    private final Productionnull_34995 production = new Productionnull_34995("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}