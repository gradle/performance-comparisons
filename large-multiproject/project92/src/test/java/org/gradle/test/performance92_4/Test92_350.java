package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_350 {
    private final Production92_350 production = new Production92_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}