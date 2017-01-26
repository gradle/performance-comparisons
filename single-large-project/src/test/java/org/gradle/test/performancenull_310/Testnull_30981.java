package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30981 {
    private final Productionnull_30981 production = new Productionnull_30981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}