package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_27 {
    private final Production48_27 production = new Production48_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}