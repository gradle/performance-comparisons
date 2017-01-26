package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_424 {
    private final Production98_424 production = new Production98_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}