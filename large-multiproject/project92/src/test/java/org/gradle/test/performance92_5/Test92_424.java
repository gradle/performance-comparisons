package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_424 {
    private final Production92_424 production = new Production92_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}