package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36079 {
    private final Productionnull_36079 production = new Productionnull_36079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}