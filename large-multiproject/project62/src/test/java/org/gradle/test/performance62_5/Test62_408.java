package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_408 {
    private final Production62_408 production = new Production62_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}