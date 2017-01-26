package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_327 {
    private final Production99_327 production = new Production99_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}