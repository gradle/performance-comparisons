package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31885 {
    private final Productionnull_31885 production = new Productionnull_31885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}