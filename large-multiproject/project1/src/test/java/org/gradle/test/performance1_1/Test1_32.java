package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_32 {
    private final Production1_32 production = new Production1_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}