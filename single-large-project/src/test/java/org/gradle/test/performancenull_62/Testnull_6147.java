package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6147 {
    private final Productionnull_6147 production = new Productionnull_6147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}