package org.gradle.test.performancenull_86;

import static org.junit.Assert.*;

public class Testnull_8501 {
    private final Productionnull_8501 production = new Productionnull_8501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}