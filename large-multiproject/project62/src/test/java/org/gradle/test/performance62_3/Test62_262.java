package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_262 {
    private final Production62_262 production = new Production62_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}