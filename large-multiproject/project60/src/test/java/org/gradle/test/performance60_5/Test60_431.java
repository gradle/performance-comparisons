package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_431 {
    private final Production60_431 production = new Production60_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}