package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_149 {
    private final Production62_149 production = new Production62_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}