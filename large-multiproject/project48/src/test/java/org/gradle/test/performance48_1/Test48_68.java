package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_68 {
    private final Production48_68 production = new Production48_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}