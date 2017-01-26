package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39925 {
    private final Productionnull_39925 production = new Productionnull_39925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}