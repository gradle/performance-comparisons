package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_197 {
    private final Production1_197 production = new Production1_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}