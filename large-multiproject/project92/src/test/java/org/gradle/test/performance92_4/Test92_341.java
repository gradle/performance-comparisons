package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_341 {
    private final Production92_341 production = new Production92_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}