package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_377 {
    private final Production84_377 production = new Production84_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}