package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_216 {
    private final Production92_216 production = new Production92_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}