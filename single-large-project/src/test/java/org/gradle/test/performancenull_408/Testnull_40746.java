package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40746 {
    private final Productionnull_40746 production = new Productionnull_40746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}