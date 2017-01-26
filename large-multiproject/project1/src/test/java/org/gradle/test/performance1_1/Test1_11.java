package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_11 {
    private final Production1_11 production = new Production1_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}