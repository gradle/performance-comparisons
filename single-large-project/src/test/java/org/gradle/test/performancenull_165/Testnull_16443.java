package org.gradle.test.performancenull_165;

import static org.junit.Assert.*;

public class Testnull_16443 {
    private final Productionnull_16443 production = new Productionnull_16443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}