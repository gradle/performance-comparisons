package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_398 {
    private final Production4_398 production = new Production4_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}