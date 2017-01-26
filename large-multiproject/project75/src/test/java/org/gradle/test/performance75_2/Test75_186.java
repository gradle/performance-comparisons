package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_186 {
    private final Production75_186 production = new Production75_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}