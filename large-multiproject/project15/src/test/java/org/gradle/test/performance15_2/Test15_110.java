package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_110 {
    private final Production15_110 production = new Production15_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}