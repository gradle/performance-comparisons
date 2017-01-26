package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23779 {
    private final Productionnull_23779 production = new Productionnull_23779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}