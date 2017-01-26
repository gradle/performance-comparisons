package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_41 {
    private final Production48_41 production = new Production48_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}