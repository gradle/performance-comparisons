package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_375 {
    private final Production62_375 production = new Production62_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}