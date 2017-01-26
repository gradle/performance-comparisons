package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_356 {
    private final Production48_356 production = new Production48_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}