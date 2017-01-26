package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16079 {
    private final Productionnull_16079 production = new Productionnull_16079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}