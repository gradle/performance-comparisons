package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10079 {
    private final Productionnull_10079 production = new Productionnull_10079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}