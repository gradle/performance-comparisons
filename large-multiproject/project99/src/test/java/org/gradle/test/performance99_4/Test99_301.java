package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_301 {
    private final Production99_301 production = new Production99_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}