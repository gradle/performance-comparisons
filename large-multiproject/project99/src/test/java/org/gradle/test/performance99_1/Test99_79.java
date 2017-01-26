package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_79 {
    private final Production99_79 production = new Production99_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}