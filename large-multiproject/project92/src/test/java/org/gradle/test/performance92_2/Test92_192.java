package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_192 {
    private final Production92_192 production = new Production92_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}