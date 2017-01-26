package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_37 {
    private final Production92_37 production = new Production92_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}