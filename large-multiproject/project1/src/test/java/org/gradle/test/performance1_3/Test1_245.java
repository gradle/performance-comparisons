package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_245 {
    private final Production1_245 production = new Production1_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}