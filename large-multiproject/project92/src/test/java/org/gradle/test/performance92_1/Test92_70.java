package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_70 {
    private final Production92_70 production = new Production92_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}