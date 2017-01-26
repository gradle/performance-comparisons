package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21642 {
    private final Productionnull_21642 production = new Productionnull_21642("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}