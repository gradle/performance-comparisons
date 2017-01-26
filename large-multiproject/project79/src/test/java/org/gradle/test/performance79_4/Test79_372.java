package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_372 {
    private final Production79_372 production = new Production79_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}