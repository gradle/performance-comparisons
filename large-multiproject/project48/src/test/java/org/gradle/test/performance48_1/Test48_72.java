package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_72 {
    private final Production48_72 production = new Production48_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}