package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_359 {
    private final Production62_359 production = new Production62_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}