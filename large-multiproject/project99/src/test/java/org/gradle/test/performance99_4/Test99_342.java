package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_342 {
    private final Production99_342 production = new Production99_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}