package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_427 {
    private final Production48_427 production = new Production48_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}