package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_47 {
    private final Production92_47 production = new Production92_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}