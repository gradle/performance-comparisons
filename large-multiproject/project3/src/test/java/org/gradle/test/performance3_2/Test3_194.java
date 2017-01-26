package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_194 {
    private final Production3_194 production = new Production3_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}