package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_464 {
    private final Production99_464 production = new Production99_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}