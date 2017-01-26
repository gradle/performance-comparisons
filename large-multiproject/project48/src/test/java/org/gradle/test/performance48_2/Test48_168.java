package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_168 {
    private final Production48_168 production = new Production48_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}