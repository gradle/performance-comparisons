package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23783 {
    private final Productionnull_23783 production = new Productionnull_23783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}