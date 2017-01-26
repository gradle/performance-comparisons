package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_166 {
    private final Production48_166 production = new Production48_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}