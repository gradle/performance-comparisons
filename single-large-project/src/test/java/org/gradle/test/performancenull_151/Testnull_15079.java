package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15079 {
    private final Productionnull_15079 production = new Productionnull_15079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}