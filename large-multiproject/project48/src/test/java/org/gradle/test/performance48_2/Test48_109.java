package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_109 {
    private final Production48_109 production = new Production48_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}