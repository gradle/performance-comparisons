package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_286 {
    private final Production75_286 production = new Production75_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}