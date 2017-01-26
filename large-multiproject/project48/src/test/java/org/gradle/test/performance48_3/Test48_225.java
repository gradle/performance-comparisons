package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_225 {
    private final Production48_225 production = new Production48_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}