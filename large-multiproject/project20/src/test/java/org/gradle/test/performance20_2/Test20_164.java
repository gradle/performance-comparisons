package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_164 {
    private final Production20_164 production = new Production20_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}