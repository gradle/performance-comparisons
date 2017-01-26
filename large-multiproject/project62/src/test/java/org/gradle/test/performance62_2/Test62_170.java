package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_170 {
    private final Production62_170 production = new Production62_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}