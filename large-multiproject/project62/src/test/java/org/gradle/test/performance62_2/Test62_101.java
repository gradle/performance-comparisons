package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_101 {
    private final Production62_101 production = new Production62_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}