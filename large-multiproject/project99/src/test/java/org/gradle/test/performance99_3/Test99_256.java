package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_256 {
    private final Production99_256 production = new Production99_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}