package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_226 {
    private final Production92_226 production = new Production92_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}