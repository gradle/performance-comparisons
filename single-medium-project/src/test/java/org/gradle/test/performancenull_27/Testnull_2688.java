package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2688 {
    private final Productionnull_2688 production = new Productionnull_2688("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}