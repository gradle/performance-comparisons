package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_327 {
    private final Production7_327 production = new Production7_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}