package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_156 {
    private final Production92_156 production = new Production92_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}