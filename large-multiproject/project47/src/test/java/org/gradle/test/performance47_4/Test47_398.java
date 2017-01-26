package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_398 {
    private final Production47_398 production = new Production47_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}