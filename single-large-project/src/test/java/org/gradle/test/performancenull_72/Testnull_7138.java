package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7138 {
    private final Productionnull_7138 production = new Productionnull_7138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}