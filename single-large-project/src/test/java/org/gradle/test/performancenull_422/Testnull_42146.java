package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42146 {
    private final Productionnull_42146 production = new Productionnull_42146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}