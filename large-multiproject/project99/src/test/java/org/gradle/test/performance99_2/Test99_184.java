package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_184 {
    private final Production99_184 production = new Production99_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}