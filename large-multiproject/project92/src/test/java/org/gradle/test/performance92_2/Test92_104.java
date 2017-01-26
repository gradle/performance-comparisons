package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_104 {
    private final Production92_104 production = new Production92_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}