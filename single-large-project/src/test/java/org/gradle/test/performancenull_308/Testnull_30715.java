package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30715 {
    private final Productionnull_30715 production = new Productionnull_30715("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}