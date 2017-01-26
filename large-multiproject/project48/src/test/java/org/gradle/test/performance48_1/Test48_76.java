package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_76 {
    private final Production48_76 production = new Production48_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}