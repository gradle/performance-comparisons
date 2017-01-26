package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27180 {
    private final Productionnull_27180 production = new Productionnull_27180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}