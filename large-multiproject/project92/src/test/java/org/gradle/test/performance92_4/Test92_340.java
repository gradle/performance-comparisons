package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_340 {
    private final Production92_340 production = new Production92_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}