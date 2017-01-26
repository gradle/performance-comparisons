package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_315 {
    private final Production89_315 production = new Production89_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}