package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_235 {
    private final Production62_235 production = new Production62_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}