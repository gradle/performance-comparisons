package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_468 {
    private final Production99_468 production = new Production99_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}