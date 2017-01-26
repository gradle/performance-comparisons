package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_105 {
    private final Production92_105 production = new Production92_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}