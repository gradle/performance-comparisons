package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_275 {
    private final Production99_275 production = new Production99_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}