package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14973 {
    private final Productionnull_14973 production = new Productionnull_14973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}