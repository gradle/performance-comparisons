package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_327 {
    private final Production90_327 production = new Production90_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}