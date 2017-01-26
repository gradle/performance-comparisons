package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_311 {
    private final Production62_311 production = new Production62_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}