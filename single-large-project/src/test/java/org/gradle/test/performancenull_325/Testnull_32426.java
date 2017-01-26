package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32426 {
    private final Productionnull_32426 production = new Productionnull_32426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}