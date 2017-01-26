package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_431 {
    private final Production20_431 production = new Production20_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}