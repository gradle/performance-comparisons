package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_321 {
    private final Production20_321 production = new Production20_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}