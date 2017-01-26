package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_260 {
    private final Production92_260 production = new Production92_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}