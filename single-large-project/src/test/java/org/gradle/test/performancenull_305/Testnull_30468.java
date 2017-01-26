package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30468 {
    private final Productionnull_30468 production = new Productionnull_30468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}