package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_375 {
    private final Production1_375 production = new Production1_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}