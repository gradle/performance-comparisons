package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_53 {
    private final Production92_53 production = new Production92_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}