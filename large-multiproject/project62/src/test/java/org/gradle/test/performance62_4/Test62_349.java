package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_349 {
    private final Production62_349 production = new Production62_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}