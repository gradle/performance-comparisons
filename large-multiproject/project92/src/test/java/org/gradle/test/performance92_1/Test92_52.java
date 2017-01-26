package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_52 {
    private final Production92_52 production = new Production92_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}