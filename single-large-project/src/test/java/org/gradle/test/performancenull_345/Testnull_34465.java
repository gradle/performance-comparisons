package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34465 {
    private final Productionnull_34465 production = new Productionnull_34465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}