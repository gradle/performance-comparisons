package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_385 {
    private final Production1_385 production = new Production1_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}