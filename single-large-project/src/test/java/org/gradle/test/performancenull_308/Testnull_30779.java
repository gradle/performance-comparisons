package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30779 {
    private final Productionnull_30779 production = new Productionnull_30779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}