package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_465 {
    private final Production48_465 production = new Production48_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}