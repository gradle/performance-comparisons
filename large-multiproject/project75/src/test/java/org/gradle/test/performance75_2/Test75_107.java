package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_107 {
    private final Production75_107 production = new Production75_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}