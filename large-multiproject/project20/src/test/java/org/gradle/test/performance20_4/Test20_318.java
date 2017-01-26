package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_318 {
    private final Production20_318 production = new Production20_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}