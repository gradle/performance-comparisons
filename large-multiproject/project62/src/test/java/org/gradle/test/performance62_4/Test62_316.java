package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_316 {
    private final Production62_316 production = new Production62_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}