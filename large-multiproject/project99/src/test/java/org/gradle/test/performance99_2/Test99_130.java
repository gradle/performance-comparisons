package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_130 {
    private final Production99_130 production = new Production99_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}