package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_315 {
    private final Production49_315 production = new Production49_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}