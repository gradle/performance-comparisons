package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_153 {
    private final Production62_153 production = new Production62_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}