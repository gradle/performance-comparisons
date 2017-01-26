package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_442 {
    private final Production48_442 production = new Production48_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}