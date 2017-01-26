package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_119 {
    private final Production48_119 production = new Production48_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}