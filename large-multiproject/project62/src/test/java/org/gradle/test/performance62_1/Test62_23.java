package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_23 {
    private final Production62_23 production = new Production62_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}