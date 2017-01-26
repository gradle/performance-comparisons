package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13085 {
    private final Productionnull_13085 production = new Productionnull_13085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}