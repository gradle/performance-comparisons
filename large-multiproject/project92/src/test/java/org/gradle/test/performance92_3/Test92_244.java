package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_244 {
    private final Production92_244 production = new Production92_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}