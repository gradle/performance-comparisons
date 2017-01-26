package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_421 {
    private final Production92_421 production = new Production92_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}