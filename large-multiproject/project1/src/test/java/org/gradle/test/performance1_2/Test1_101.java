package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_101 {
    private final Production1_101 production = new Production1_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}