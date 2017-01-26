package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_455 {
    private final Production79_455 production = new Production79_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}