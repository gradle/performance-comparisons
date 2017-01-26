package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30753 {
    private final Productionnull_30753 production = new Productionnull_30753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}