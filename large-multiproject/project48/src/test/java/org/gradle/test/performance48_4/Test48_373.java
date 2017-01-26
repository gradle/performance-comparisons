package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_373 {
    private final Production48_373 production = new Production48_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}