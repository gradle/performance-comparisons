package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_262 {
    private final Production27_262 production = new Production27_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}