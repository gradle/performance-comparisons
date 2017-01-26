package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49885 {
    private final Productionnull_49885 production = new Productionnull_49885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}