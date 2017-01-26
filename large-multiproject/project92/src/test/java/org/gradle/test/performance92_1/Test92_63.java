package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_63 {
    private final Production92_63 production = new Production92_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}