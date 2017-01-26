package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34264 {
    private final Productionnull_34264 production = new Productionnull_34264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}