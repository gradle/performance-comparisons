package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_90 {
    private final Production20_90 production = new Production20_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}