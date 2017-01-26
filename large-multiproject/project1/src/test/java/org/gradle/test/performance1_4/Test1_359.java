package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_359 {
    private final Production1_359 production = new Production1_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}