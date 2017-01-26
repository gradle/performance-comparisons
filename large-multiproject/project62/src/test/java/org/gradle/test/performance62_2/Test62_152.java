package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_152 {
    private final Production62_152 production = new Production62_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}