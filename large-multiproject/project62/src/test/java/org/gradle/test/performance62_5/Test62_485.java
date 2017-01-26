package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_485 {
    private final Production62_485 production = new Production62_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}