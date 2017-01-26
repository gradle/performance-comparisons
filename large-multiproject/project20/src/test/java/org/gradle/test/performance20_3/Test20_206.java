package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_206 {
    private final Production20_206 production = new Production20_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}