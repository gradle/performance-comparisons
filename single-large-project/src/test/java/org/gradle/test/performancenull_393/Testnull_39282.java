package org.gradle.test.performancenull_393;

import static org.junit.Assert.*;

public class Testnull_39282 {
    private final Productionnull_39282 production = new Productionnull_39282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}