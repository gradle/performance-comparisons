package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_81 {
    private final Production92_81 production = new Production92_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}