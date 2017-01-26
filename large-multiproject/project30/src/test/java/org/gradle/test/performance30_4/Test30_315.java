package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_315 {
    private final Production30_315 production = new Production30_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}