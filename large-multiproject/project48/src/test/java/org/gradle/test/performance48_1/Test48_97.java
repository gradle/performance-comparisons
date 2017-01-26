package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_97 {
    private final Production48_97 production = new Production48_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}