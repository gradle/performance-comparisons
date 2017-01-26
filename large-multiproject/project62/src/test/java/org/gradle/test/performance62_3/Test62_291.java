package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_291 {
    private final Production62_291 production = new Production62_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}