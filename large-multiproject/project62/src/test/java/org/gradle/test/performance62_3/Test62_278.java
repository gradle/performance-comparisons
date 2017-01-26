package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_278 {
    private final Production62_278 production = new Production62_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}