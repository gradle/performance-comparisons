package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_154 {
    private final Production75_154 production = new Production75_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}