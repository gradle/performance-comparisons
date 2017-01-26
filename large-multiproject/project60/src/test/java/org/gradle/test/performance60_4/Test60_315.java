package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_315 {
    private final Production60_315 production = new Production60_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}