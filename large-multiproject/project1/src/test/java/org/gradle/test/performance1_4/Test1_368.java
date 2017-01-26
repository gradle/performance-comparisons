package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_368 {
    private final Production1_368 production = new Production1_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}