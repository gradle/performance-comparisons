package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_428 {
    private final Production1_428 production = new Production1_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}