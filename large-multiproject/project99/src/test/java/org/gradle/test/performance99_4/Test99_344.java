package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_344 {
    private final Production99_344 production = new Production99_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}