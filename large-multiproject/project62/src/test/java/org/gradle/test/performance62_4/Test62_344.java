package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_344 {
    private final Production62_344 production = new Production62_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}