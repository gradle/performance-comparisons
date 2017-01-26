package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_198 {
    private final Production1_198 production = new Production1_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}