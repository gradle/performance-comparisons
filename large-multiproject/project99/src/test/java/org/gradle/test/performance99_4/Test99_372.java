package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_372 {
    private final Production99_372 production = new Production99_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}