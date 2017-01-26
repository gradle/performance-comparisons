package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_117 {
    private final Production1_117 production = new Production1_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}