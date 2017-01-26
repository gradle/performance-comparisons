package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_315 {
    private final Production44_315 production = new Production44_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}