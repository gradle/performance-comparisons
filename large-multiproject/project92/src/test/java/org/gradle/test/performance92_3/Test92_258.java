package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_258 {
    private final Production92_258 production = new Production92_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}