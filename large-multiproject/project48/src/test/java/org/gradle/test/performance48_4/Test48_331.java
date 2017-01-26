package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_331 {
    private final Production48_331 production = new Production48_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}