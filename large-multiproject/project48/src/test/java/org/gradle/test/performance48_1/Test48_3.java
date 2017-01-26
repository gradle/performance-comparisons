package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_3 {
    private final Production48_3 production = new Production48_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}