package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_38 {
    private final Production48_38 production = new Production48_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}