package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_42 {
    private final Production75_42 production = new Production75_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}