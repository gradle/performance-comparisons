package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_83 {
    private final Production20_83 production = new Production20_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}