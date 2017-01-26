package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_343 {
    private final Production92_343 production = new Production92_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}