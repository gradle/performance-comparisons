package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_162 {
    private final Production92_162 production = new Production92_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}