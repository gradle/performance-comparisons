package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_96 {
    private final Production48_96 production = new Production48_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}