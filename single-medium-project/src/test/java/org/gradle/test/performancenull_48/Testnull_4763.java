package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4763 {
    private final Productionnull_4763 production = new Productionnull_4763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}