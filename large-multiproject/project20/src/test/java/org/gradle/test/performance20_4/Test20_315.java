package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_315 {
    private final Production20_315 production = new Production20_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}