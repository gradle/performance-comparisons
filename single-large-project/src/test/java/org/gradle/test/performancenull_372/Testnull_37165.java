package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37165 {
    private final Productionnull_37165 production = new Productionnull_37165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}