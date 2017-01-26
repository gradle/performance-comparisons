package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42190 {
    private final Productionnull_42190 production = new Productionnull_42190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}