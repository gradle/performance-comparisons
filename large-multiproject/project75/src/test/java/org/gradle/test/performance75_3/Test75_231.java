package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_231 {
    private final Production75_231 production = new Production75_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}