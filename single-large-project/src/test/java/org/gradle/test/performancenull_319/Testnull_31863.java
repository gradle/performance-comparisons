package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31863 {
    private final Productionnull_31863 production = new Productionnull_31863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}