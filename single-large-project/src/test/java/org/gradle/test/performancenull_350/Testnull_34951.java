package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34951 {
    private final Productionnull_34951 production = new Productionnull_34951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}