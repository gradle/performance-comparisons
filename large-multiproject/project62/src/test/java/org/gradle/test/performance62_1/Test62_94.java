package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_94 {
    private final Production62_94 production = new Production62_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}