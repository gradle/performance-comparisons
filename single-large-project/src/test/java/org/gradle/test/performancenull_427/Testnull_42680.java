package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42680 {
    private final Productionnull_42680 production = new Productionnull_42680("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}