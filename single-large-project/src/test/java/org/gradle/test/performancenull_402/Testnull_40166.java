package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40166 {
    private final Productionnull_40166 production = new Productionnull_40166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}