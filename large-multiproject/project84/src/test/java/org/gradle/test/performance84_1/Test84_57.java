package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_57 {
    private final Production84_57 production = new Production84_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}