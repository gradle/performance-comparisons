package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_470 {
    private final Production99_470 production = new Production99_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}