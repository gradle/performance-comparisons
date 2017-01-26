package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_126 {
    private final Production48_126 production = new Production48_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}