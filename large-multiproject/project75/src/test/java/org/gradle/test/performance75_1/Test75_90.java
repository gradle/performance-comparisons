package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_90 {
    private final Production75_90 production = new Production75_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}