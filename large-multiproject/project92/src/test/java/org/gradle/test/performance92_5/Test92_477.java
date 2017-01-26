package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_477 {
    private final Production92_477 production = new Production92_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}