package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36166 {
    private final Productionnull_36166 production = new Productionnull_36166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}