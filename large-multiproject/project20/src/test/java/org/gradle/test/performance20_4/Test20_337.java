package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_337 {
    private final Production20_337 production = new Production20_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}