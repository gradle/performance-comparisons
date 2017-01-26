package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_79 {
    private final Production62_79 production = new Production62_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}