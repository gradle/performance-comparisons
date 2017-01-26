package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_440 {
    private final Production99_440 production = new Production99_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}