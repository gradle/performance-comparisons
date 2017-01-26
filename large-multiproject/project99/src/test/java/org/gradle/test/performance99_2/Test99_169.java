package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_169 {
    private final Production99_169 production = new Production99_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}