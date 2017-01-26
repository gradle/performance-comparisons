package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_287 {
    private final Production92_287 production = new Production92_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}