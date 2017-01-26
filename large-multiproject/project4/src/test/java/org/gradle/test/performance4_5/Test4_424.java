package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_424 {
    private final Production4_424 production = new Production4_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}