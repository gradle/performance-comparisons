package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_100 {
    private final Production48_100 production = new Production48_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}