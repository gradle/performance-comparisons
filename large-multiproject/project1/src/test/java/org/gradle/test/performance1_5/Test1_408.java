package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_408 {
    private final Production1_408 production = new Production1_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}