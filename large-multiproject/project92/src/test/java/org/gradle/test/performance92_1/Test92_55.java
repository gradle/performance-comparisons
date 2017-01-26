package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_55 {
    private final Production92_55 production = new Production92_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}