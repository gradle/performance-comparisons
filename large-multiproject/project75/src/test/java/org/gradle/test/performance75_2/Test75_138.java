package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_138 {
    private final Production75_138 production = new Production75_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}