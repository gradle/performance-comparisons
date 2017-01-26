package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_292 {
    private final Production15_292 production = new Production15_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}