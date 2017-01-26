package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_334 {
    private final Production92_334 production = new Production92_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}