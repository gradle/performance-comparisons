package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_165 {
    private final Production20_165 production = new Production20_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}