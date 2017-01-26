package org.gradle.test.performancenull_37;

import static org.junit.Assert.*;

public class Testnull_3683 {
    private final Productionnull_3683 production = new Productionnull_3683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}