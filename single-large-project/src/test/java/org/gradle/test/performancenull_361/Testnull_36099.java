package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36099 {
    private final Productionnull_36099 production = new Productionnull_36099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}