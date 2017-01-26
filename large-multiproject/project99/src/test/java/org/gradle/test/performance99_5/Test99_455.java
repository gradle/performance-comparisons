package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_455 {
    private final Production99_455 production = new Production99_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}