package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_347 {
    private final Production48_347 production = new Production48_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}