package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_61 {
    private final Production75_61 production = new Production75_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}