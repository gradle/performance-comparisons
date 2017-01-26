package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_125 {
    private final Production62_125 production = new Production62_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}