package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_315 {
    private final Production15_315 production = new Production15_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}