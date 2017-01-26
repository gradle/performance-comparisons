package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_431 {
    private final Production5_431 production = new Production5_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}