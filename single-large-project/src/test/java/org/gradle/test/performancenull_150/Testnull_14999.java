package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14999 {
    private final Productionnull_14999 production = new Productionnull_14999("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}