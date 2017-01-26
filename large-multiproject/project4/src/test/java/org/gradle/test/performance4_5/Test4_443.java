package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_443 {
    private final Production4_443 production = new Production4_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}