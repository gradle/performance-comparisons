package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21609 {
    private final Productionnull_21609 production = new Productionnull_21609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}