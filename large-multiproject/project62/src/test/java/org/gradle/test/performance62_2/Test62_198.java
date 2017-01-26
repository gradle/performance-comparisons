package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_198 {
    private final Production62_198 production = new Production62_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}