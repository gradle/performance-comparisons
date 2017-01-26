package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_101 {
    private final Production99_101 production = new Production99_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}