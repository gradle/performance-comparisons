package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_194 {
    private final Production11_194 production = new Production11_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}