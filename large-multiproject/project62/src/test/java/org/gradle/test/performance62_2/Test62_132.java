package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_132 {
    private final Production62_132 production = new Production62_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}