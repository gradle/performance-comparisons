package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_376 {
    private final Production1_376 production = new Production1_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}