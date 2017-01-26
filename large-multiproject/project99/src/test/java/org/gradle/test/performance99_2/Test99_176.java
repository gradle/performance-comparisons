package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_176 {
    private final Production99_176 production = new Production99_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}