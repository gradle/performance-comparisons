package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37823 {
    private final Productionnull_37823 production = new Productionnull_37823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}