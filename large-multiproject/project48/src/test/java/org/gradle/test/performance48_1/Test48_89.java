package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_89 {
    private final Production48_89 production = new Production48_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}