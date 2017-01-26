package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_194 {
    private final Production60_194 production = new Production60_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}