package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42648 {
    private final Productionnull_42648 production = new Productionnull_42648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}