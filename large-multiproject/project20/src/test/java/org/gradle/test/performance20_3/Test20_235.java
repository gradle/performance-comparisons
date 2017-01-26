package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_235 {
    private final Production20_235 production = new Production20_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}