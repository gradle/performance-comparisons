package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_288 {
    private final Production48_288 production = new Production48_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}