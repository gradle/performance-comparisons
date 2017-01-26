package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36102 {
    private final Productionnull_36102 production = new Productionnull_36102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}