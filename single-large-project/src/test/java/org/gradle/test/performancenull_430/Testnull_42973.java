package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42973 {
    private final Productionnull_42973 production = new Productionnull_42973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}