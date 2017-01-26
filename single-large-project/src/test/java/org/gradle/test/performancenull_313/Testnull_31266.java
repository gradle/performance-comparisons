package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31266 {
    private final Productionnull_31266 production = new Productionnull_31266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}