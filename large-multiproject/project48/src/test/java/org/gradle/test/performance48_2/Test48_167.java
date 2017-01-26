package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_167 {
    private final Production48_167 production = new Production48_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}