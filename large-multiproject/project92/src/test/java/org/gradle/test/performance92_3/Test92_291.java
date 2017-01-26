package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_291 {
    private final Production92_291 production = new Production92_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}