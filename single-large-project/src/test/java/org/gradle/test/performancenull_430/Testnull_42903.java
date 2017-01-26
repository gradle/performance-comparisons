package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42903 {
    private final Productionnull_42903 production = new Productionnull_42903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}