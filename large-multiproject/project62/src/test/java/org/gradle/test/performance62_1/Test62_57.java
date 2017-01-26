package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_57 {
    private final Production62_57 production = new Production62_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}