package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_282 {
    private final Production48_282 production = new Production48_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}