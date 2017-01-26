package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20154 {
    private final Productionnull_20154 production = new Productionnull_20154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}