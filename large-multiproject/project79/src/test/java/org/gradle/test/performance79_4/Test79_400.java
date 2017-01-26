package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_400 {
    private final Production79_400 production = new Production79_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}