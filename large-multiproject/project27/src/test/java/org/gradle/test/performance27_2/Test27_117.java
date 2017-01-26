package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_117 {
    private final Production27_117 production = new Production27_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}