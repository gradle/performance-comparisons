package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_62 {
    private final Production48_62 production = new Production48_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}