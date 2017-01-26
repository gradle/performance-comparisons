package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_487 {
    private final Production62_487 production = new Production62_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}