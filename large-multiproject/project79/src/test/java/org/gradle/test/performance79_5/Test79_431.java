package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_431 {
    private final Production79_431 production = new Production79_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}