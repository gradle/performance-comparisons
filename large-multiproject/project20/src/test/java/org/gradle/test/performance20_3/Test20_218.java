package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_218 {
    private final Production20_218 production = new Production20_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}