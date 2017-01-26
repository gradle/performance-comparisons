package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_124 {
    private final Production99_124 production = new Production99_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}