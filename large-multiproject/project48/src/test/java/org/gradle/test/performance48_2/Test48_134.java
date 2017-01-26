package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_134 {
    private final Production48_134 production = new Production48_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}