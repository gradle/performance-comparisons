package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1809 {
    private final Productionnull_1809 production = new Productionnull_1809("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}