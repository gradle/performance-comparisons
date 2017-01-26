package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34462 {
    private final Productionnull_34462 production = new Productionnull_34462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}