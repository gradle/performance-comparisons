package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_315 {
    private final Production7_315 production = new Production7_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}