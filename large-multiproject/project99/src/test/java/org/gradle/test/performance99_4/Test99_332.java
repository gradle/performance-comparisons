package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_332 {
    private final Production99_332 production = new Production99_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}