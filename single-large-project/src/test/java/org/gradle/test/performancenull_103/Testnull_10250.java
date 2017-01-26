package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10250 {
    private final Productionnull_10250 production = new Productionnull_10250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}