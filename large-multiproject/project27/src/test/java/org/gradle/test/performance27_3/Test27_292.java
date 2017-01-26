package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_292 {
    private final Production27_292 production = new Production27_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}