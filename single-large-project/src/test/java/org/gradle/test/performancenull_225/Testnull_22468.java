package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22468 {
    private final Productionnull_22468 production = new Productionnull_22468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}