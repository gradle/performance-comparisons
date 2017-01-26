package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_185 {
    private final Production90_185 production = new Production90_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}