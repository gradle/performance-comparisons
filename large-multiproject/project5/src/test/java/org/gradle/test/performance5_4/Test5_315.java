package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_315 {
    private final Production5_315 production = new Production5_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}