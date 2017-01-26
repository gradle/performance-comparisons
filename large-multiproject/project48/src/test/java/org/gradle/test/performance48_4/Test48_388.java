package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_388 {
    private final Production48_388 production = new Production48_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}