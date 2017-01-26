package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_309 {
    private final Production20_309 production = new Production20_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}