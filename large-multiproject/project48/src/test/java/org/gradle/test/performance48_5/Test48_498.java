package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_498 {
    private final Production48_498 production = new Production48_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}