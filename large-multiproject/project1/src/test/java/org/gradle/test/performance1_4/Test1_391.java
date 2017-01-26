package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_391 {
    private final Production1_391 production = new Production1_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}