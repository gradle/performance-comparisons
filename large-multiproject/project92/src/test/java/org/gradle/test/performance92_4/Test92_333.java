package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_333 {
    private final Production92_333 production = new Production92_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}