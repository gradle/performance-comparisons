package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12079 {
    private final Productionnull_12079 production = new Productionnull_12079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}