package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_466 {
    private final Production48_466 production = new Production48_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}