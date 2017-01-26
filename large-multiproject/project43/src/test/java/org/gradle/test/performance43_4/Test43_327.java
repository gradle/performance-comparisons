package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_327 {
    private final Production43_327 production = new Production43_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}