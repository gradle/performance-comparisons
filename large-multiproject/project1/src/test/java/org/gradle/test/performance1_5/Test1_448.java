package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_448 {
    private final Production1_448 production = new Production1_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}