package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26079 {
    private final Productionnull_26079 production = new Productionnull_26079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}