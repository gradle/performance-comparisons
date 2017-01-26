package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_18 {
    private final Production92_18 production = new Production92_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}