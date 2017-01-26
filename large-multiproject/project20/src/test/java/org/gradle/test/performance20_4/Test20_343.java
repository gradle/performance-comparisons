package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_343 {
    private final Production20_343 production = new Production20_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}