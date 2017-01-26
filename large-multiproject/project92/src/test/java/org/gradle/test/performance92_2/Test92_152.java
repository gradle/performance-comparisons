package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_152 {
    private final Production92_152 production = new Production92_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}