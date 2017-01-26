package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_172 {
    private final Production48_172 production = new Production48_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}