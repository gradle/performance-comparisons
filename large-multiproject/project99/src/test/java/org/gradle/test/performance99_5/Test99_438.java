package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_438 {
    private final Production99_438 production = new Production99_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}