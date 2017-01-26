package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30746 {
    private final Productionnull_30746 production = new Productionnull_30746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}