package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_175 {
    private final Production75_175 production = new Production75_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}