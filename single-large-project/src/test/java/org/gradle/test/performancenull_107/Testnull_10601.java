package org.gradle.test.performancenull_107;

import static org.junit.Assert.*;

public class Testnull_10601 {
    private final Productionnull_10601 production = new Productionnull_10601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}