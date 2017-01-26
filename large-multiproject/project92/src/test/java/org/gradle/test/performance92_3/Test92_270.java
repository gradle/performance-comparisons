package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_270 {
    private final Production92_270 production = new Production92_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}