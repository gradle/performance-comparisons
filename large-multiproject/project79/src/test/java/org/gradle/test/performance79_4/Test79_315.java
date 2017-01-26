package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_315 {
    private final Production79_315 production = new Production79_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}