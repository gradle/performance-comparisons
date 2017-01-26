package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40443 {
    private final Productionnull_40443 production = new Productionnull_40443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}