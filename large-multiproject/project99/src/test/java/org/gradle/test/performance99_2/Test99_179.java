package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_179 {
    private final Production99_179 production = new Production99_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}