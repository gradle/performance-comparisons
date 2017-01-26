package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30745 {
    private final Productionnull_30745 production = new Productionnull_30745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}