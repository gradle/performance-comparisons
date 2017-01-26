package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30719 {
    private final Productionnull_30719 production = new Productionnull_30719("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}