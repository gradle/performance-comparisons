package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_345 {
    private final Production92_345 production = new Production92_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}