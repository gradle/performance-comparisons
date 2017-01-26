package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_61 {
    private final Production48_61 production = new Production48_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}