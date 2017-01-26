package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_237 {
    private final Production1_237 production = new Production1_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}