package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4250 {
    private final Productionnull_4250 production = new Productionnull_4250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}