package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_315 {
    private final Production24_315 production = new Production24_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}