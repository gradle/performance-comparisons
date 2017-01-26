package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_158 {
    private final Production99_158 production = new Production99_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}