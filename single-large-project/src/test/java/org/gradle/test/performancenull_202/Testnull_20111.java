package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20111 {
    private final Productionnull_20111 production = new Productionnull_20111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}