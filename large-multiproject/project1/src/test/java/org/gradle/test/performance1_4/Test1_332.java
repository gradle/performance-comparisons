package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_332 {
    private final Production1_332 production = new Production1_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}