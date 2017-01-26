package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_316 {
    private final Production99_316 production = new Production99_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}