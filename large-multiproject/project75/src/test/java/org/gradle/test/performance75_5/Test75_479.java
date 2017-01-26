package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_479 {
    private final Production75_479 production = new Production75_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}