package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_44 {
    private final Production48_44 production = new Production48_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}