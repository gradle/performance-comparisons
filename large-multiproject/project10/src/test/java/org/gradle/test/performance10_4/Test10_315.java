package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_315 {
    private final Production10_315 production = new Production10_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}