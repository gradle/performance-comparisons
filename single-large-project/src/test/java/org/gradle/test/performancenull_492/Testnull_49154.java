package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49154 {
    private final Productionnull_49154 production = new Productionnull_49154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}