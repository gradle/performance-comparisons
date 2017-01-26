package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_330 {
    private final Production75_330 production = new Production75_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}