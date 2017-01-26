package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14903 {
    private final Productionnull_14903 production = new Productionnull_14903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}