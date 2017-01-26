package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_438 {
    private final Production79_438 production = new Production79_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}