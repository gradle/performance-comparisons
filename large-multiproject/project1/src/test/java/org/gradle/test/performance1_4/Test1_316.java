package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_316 {
    private final Production1_316 production = new Production1_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}