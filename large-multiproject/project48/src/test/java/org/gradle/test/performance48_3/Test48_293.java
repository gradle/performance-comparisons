package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_293 {
    private final Production48_293 production = new Production48_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}