package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_232 {
    private final Production62_232 production = new Production62_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}