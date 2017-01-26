package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_403 {
    private final Production92_403 production = new Production92_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}