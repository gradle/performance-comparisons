package org.gradle.test.performancenull_46;

import static org.junit.Assert.*;

public class Testnull_4576 {
    private final Productionnull_4576 production = new Productionnull_4576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}