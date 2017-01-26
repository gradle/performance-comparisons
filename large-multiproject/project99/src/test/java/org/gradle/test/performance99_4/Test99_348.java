package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_348 {
    private final Production99_348 production = new Production99_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}