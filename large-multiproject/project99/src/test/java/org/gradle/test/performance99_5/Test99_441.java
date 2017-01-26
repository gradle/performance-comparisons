package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_441 {
    private final Production99_441 production = new Production99_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}