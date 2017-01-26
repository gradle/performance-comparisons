package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_187 {
    private final Production92_187 production = new Production92_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}