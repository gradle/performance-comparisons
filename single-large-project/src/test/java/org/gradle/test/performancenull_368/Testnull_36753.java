package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36753 {
    private final Productionnull_36753 production = new Productionnull_36753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}