package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_80 {
    private final Production48_80 production = new Production48_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}