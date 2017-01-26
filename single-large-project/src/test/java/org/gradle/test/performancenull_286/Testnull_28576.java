package org.gradle.test.performancenull_286;

import static org.junit.Assert.*;

public class Testnull_28576 {
    private final Productionnull_28576 production = new Productionnull_28576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}