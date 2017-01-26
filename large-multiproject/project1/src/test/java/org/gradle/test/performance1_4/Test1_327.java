package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_327 {
    private final Production1_327 production = new Production1_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}