package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_112 {
    private final Production48_112 production = new Production48_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}