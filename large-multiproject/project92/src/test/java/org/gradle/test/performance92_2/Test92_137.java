package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_137 {
    private final Production92_137 production = new Production92_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}