package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_262 {
    private final Production7_262 production = new Production7_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}