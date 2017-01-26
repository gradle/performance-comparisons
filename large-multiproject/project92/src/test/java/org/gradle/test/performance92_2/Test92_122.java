package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_122 {
    private final Production92_122 production = new Production92_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}