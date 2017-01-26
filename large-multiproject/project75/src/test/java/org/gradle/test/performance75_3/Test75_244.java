package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_244 {
    private final Production75_244 production = new Production75_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}