package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_381 {
    private final Production92_381 production = new Production92_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}