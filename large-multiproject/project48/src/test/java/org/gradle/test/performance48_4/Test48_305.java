package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_305 {
    private final Production48_305 production = new Production48_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}