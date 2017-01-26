package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24079 {
    private final Productionnull_24079 production = new Productionnull_24079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}