package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_480 {
    private final Production99_480 production = new Production99_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}