package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_156 {
    private final Production62_156 production = new Production62_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}