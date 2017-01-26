package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_459 {
    private final Production99_459 production = new Production99_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}