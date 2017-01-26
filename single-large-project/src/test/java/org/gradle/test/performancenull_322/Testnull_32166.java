package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32166 {
    private final Productionnull_32166 production = new Productionnull_32166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}