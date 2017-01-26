package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_237 {
    private final Production62_237 production = new Production62_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}