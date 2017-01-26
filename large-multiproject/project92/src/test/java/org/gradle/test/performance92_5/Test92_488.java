package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_488 {
    private final Production92_488 production = new Production92_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}