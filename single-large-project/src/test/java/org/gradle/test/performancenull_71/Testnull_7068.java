package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7068 {
    private final Productionnull_7068 production = new Productionnull_7068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}