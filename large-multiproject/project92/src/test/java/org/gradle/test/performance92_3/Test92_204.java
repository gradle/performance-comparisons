package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_204 {
    private final Production92_204 production = new Production92_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}