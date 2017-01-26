package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_180 {
    private final Production62_180 production = new Production62_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}