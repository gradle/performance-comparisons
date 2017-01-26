package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_95 {
    private final Production92_95 production = new Production92_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}