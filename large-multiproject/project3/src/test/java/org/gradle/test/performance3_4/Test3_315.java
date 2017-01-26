package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_315 {
    private final Production3_315 production = new Production3_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}