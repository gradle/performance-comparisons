package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_43 {
    private final Production48_43 production = new Production48_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}