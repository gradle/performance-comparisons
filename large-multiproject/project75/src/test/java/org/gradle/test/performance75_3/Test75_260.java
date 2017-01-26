package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_260 {
    private final Production75_260 production = new Production75_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}