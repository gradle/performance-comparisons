package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_169 {
    private final Production62_169 production = new Production62_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}