package org.gradle.test.performancenull_276;

import static org.junit.Assert.*;

public class Testnull_27531 {
    private final Productionnull_27531 production = new Productionnull_27531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}