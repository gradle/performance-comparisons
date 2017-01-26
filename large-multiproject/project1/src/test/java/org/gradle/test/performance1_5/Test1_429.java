package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_429 {
    private final Production1_429 production = new Production1_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}