package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_158 {
    private final Production62_158 production = new Production62_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}