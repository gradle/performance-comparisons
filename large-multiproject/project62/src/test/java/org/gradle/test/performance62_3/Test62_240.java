package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_240 {
    private final Production62_240 production = new Production62_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}