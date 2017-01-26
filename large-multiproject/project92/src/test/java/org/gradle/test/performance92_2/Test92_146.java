package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_146 {
    private final Production92_146 production = new Production92_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}