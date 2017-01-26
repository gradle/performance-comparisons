package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41400 {
    private final Productionnull_41400 production = new Productionnull_41400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}