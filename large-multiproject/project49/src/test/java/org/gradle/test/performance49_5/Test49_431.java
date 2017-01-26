package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_431 {
    private final Production49_431 production = new Production49_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}