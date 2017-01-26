package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_301 {
    private final Production62_301 production = new Production62_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}