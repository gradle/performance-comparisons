package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_261 {
    private final Production92_261 production = new Production92_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}