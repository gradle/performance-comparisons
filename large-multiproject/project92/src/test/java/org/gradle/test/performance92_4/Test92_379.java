package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_379 {
    private final Production92_379 production = new Production92_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}