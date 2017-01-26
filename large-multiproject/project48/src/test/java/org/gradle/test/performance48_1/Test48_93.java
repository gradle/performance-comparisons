package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_93 {
    private final Production48_93 production = new Production48_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}