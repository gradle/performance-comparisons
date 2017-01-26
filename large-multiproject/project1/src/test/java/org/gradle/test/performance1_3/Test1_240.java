package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_240 {
    private final Production1_240 production = new Production1_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}