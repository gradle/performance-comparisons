package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_468 {
    private final Production92_468 production = new Production92_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}