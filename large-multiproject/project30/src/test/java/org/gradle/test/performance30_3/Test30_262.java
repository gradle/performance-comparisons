package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_262 {
    private final Production30_262 production = new Production30_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}