package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_75 {
    private final Production48_75 production = new Production48_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}