package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_248 {
    private final Production1_248 production = new Production1_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}