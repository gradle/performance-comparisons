package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_200 {
    private final Production48_200 production = new Production48_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}