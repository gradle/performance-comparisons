package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_400 {
    private final Production99_400 production = new Production99_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}