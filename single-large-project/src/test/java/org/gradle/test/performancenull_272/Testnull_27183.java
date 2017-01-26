package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27183 {
    private final Productionnull_27183 production = new Productionnull_27183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}