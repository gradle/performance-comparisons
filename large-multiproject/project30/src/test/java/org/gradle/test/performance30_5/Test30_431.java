package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_431 {
    private final Production30_431 production = new Production30_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}