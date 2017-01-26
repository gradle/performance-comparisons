package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_110 {
    private final Production27_110 production = new Production27_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}