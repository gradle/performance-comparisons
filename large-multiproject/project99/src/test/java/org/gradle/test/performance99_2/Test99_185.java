package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_185 {
    private final Production99_185 production = new Production99_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}