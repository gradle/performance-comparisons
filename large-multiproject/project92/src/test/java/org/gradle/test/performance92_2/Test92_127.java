package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_127 {
    private final Production92_127 production = new Production92_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}