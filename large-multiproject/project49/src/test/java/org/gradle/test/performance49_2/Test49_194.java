package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_194 {
    private final Production49_194 production = new Production49_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}