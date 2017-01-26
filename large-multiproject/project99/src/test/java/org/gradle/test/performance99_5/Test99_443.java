package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_443 {
    private final Production99_443 production = new Production99_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}