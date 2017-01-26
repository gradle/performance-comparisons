package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_428 {
    private final Production79_428 production = new Production79_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}