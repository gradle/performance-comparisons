package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_339 {
    private final Production99_339 production = new Production99_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}