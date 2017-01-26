package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_64 {
    private final Production92_64 production = new Production92_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}