package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_210 {
    private final Production75_210 production = new Production75_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}