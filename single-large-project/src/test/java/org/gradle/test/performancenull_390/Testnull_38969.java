package org.gradle.test.performancenull_390;

import static org.junit.Assert.*;

public class Testnull_38969 {
    private final Productionnull_38969 production = new Productionnull_38969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}