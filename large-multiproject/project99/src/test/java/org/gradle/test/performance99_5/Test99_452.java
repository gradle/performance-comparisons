package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_452 {
    private final Production99_452 production = new Production99_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}