package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_248 {
    private final Production62_248 production = new Production62_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}