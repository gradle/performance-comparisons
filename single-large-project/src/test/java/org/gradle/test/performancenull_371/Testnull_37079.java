package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37079 {
    private final Productionnull_37079 production = new Productionnull_37079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}