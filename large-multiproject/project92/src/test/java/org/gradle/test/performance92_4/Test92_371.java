package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_371 {
    private final Production92_371 production = new Production92_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}