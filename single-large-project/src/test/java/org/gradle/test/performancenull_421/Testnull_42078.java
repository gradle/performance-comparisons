package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42078 {
    private final Productionnull_42078 production = new Productionnull_42078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}