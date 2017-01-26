package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_335 {
    private final Production1_335 production = new Production1_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}