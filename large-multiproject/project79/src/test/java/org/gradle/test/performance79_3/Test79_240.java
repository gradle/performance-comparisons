package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_240 {
    private final Production79_240 production = new Production79_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}