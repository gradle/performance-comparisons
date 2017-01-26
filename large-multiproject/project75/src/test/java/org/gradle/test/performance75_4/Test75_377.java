package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_377 {
    private final Production75_377 production = new Production75_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}