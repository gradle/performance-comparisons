package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_240 {
    private final Production99_240 production = new Production99_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}