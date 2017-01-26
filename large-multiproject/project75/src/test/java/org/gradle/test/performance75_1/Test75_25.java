package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_25 {
    private final Production75_25 production = new Production75_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}