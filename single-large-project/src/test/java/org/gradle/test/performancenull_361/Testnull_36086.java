package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36086 {
    private final Productionnull_36086 production = new Productionnull_36086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}