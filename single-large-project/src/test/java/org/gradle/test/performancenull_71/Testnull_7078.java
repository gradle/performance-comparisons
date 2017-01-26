package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7078 {
    private final Productionnull_7078 production = new Productionnull_7078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}