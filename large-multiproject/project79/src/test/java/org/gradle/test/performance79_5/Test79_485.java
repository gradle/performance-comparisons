package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_485 {
    private final Production79_485 production = new Production79_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}