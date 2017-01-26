package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_308 {
    private final Production62_308 production = new Production62_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}