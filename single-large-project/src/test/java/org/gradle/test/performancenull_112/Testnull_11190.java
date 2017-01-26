package org.gradle.test.performancenull_112;

import static org.junit.Assert.*;

public class Testnull_11190 {
    private final Productionnull_11190 production = new Productionnull_11190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}