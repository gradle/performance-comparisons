package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42953 {
    private final Productionnull_42953 production = new Productionnull_42953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}