package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_49 {
    private final Production48_49 production = new Production48_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}