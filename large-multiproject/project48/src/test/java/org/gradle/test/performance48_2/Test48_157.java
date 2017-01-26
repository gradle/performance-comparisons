package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_157 {
    private final Production48_157 production = new Production48_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}