package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_376 {
    private final Production62_376 production = new Production62_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}