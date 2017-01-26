package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_278 {
    private final Production99_278 production = new Production99_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}