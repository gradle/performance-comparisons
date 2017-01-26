package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27052 {
    private final Productionnull_27052 production = new Productionnull_27052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}