package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_489 {
    private final Production99_489 production = new Production99_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}