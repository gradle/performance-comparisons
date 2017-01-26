package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35072 {
    private final Productionnull_35072 production = new Productionnull_35072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}