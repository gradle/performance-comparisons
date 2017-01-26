package org.gradle.test.performancenull_47;

import static org.junit.Assert.*;

public class Testnull_4602 {
    private final Productionnull_4602 production = new Productionnull_4602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}