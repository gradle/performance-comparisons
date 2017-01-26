package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_184 {
    private final Production1_184 production = new Production1_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}