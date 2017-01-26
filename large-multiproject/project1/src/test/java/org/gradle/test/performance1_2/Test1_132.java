package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_132 {
    private final Production1_132 production = new Production1_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}