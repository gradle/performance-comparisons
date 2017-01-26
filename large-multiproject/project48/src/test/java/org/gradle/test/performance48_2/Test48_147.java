package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_147 {
    private final Production48_147 production = new Production48_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}