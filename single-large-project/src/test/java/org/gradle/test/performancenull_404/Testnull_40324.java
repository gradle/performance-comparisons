package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40324 {
    private final Productionnull_40324 production = new Productionnull_40324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}