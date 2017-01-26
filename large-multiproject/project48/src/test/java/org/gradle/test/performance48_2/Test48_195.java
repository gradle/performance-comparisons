package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_195 {
    private final Production48_195 production = new Production48_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}