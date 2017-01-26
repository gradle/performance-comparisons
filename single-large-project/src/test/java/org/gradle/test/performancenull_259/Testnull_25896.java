package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25896 {
    private final Productionnull_25896 production = new Productionnull_25896("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}