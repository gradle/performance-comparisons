package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_281 {
    private final Production48_281 production = new Production48_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}