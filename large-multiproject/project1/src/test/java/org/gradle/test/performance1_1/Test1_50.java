package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_50 {
    private final Production1_50 production = new Production1_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}