package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_141 {
    private final Production79_141 production = new Production79_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}