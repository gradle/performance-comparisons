package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_136 {
    private final Production62_136 production = new Production62_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}