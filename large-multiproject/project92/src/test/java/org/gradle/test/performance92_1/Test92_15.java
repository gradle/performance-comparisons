package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_15 {
    private final Production92_15 production = new Production92_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}