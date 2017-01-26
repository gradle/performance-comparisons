package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_199 {
    private final Production48_199 production = new Production48_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}