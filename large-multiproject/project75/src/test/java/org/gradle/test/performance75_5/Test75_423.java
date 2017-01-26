package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_423 {
    private final Production75_423 production = new Production75_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}