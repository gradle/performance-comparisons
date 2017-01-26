package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_150 {
    private final Production92_150 production = new Production92_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}