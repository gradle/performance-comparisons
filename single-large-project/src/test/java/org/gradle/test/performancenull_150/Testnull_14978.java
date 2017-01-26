package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14978 {
    private final Productionnull_14978 production = new Productionnull_14978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}