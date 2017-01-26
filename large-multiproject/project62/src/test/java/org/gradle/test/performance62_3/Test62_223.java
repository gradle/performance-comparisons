package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_223 {
    private final Production62_223 production = new Production62_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}