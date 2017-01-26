package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27268 {
    private final Productionnull_27268 production = new Productionnull_27268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}