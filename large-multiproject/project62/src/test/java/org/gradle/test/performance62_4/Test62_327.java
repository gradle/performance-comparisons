package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_327 {
    private final Production62_327 production = new Production62_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}