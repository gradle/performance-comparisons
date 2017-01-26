package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42682 {
    private final Productionnull_42682 production = new Productionnull_42682("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}