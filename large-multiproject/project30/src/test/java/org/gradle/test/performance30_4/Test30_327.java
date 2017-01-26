package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_327 {
    private final Production30_327 production = new Production30_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}