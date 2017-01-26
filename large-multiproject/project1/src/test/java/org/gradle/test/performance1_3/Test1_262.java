package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_262 {
    private final Production1_262 production = new Production1_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}