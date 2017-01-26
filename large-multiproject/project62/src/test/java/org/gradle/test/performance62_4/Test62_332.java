package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_332 {
    private final Production62_332 production = new Production62_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}