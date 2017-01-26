package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_401 {
    private final Production92_401 production = new Production92_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}