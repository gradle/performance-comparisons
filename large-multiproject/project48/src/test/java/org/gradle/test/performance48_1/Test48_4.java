package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_4 {
    private final Production48_4 production = new Production48_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}