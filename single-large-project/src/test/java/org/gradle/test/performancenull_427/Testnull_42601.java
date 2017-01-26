package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42601 {
    private final Productionnull_42601 production = new Productionnull_42601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}