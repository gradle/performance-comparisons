package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_48 {
    private final Production92_48 production = new Production92_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}