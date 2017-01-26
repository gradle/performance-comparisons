package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_354 {
    private final Production92_354 production = new Production92_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}