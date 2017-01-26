package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_244 {
    private final Production47_244 production = new Production47_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}