package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25961 {
    private final Productionnull_25961 production = new Productionnull_25961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}