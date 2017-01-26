package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_179 {
    private final Production62_179 production = new Production62_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}