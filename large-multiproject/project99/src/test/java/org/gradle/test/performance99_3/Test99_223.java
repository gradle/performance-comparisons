package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_223 {
    private final Production99_223 production = new Production99_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}