package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1207 {
    private final Productionnull_1207 production = new Productionnull_1207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}