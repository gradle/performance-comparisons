package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_203 {
    private final Production20_203 production = new Production20_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}