package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_490 {
    private final Production62_490 production = new Production62_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}