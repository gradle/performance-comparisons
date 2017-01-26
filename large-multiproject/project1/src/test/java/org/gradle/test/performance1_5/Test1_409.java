package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_409 {
    private final Production1_409 production = new Production1_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}